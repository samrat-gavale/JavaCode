package recursion;

import java.util.Scanner;

public class Manhattan2 {
	public static void main(String args[]){

		long[][] mat;
		int[][] blocked_ver, blocked_hor;
		mat = new long[100][100];
		blocked_ver = new int[100][100];
		blocked_hor = new int[100][100];
		int M = 1, N = 1;
		int i,j,k, prev_indx, min;
		long r,c;
		Scanner s = new Scanner(System.in);
//		M = s.nextInt();
//		N = s.nextInt();
		String blocks[] = {}; //{"0 0 1 0", "1 2 2 2", "1 1 2 1"};
		int[] single_block = new int[4];
		char[] str;
		for(i = 0; i < blocks.length; i++)
		{
			k = 0;
			prev_indx = 0;
			str = blocks[i].toCharArray();
			for(j=0;j<str.length;j++)
				if(str[j] == ' '){
					single_block[k++] = arr_to_int(str,prev_indx,j-1);
					prev_indx = j+1;
				}
			single_block[k++] = arr_to_int(str,prev_indx,j-1);
			if(single_block[0] == single_block[2]){
				min = (single_block[1]<single_block[3]?single_block[1]:single_block[3]);
				blocked_ver[min][single_block[0]] = 1;
			}
			else{
				min = (single_block[0]<single_block[2]?single_block[0]:single_block[2]);
				blocked_hor[single_block[1]][min] = 1;				
			}
		}

		System.out.println();

		for(i=0;i<=M;i++)
			for(j=0;j<=N;j++){
				if(i == 0 && j == 0){
					mat[i][j] = 1;
					continue;
				}
				r = (i>0?(blocked_ver[i-1][j] != 1 ? mat[i-1][j] : 0):0);
				c = (j>0?(blocked_hor[i][j-1] != 1 ? mat[i][j-1] : 0):0);
				mat[i][j] =  r + c;
			}
		System.out.print("mat["+M+"]["+N+"]= "+mat[M][N]);	
	}
	public static int arr_to_int(char[] str, int i1, int i2) {
		int i,n = 0;
		for(i=i1;i<=i2;i++)
			n = n*10 + str[i]-'0';
		return n;
	}
}
