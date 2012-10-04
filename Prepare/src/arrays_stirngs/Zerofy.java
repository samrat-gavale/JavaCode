package arrays_stirngs;
import java.util.Scanner;


public class Zerofy {
	public static void main(String args[])
	{
		int a[][];
		int r,c,i,j;
		Scanner s = new Scanner(System.in);
		r = s.nextInt();
		c = s.nextInt();
		a = new int[r][c];
		for(i = 0; i<r; i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j] = s.nextInt();
		
			}
		}
		for(i=0;i<r; i++){
			for(j=0;j<c;j++){	
				System.out.print(a[i][j]);
			}
			System.out.print('\n');
		}
		zerofy(a,r,c);
		for(i=0;i<r; i++){
			for(j=0;j<c;j++){	
				System.out.print(a[i][j]);
			}
			System.out.print('\n');
		}
	}
	
	static void zerofy(int arr[][], int r, int c)
	{
		int i,j;
		int rows[];
		rows = new int[r];
		int cols[];
		cols = new int[c];
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				if(arr[i][j] == 0)
				{
					rows[i] = 1;
					cols[j] = 1;
//					System.out.printf("i - %d, row[i] - %d, j - %d, col[j] - %d\n", i, rows[i], j, cols[j]);
				}
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				if((rows[i] == 1) || (cols[j] == 1)){
					arr[i][j] = 0;					
//					System.out.printf("i - %d, row[i] - %d, j - %d, col[j] - %d\n", i, rows[i], j, cols[j]);
				}
	}
}
