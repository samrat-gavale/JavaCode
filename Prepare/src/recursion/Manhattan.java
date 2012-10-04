package recursion;

public class Manhattan {
	public static void main(String args[]){
	{
		int[][] mat;
		mat = new int[5][5];
		int N,i,j;
		N = 5;
		for(i=0;i<N;i++)
			mat[0][i] = 1;
		for(i=0;i<N;i++)
			mat[i][0] = 1;
		for(i=1;i<N;i++)
			for(j=1;j<N;j++)
				mat[i][j] = mat[i-1][j] + mat[i][j-1];
/*		for(i=0;i<N;i++)
		{
			for(j=0;j<N;j++)
			{
				System.out.print(mat[i][j]);
			}
			System.out.print("\n");
		}
*/		System.out.print("Number of paths from top left to bottom right = "+mat[N-1][N-1]);	
	}
}
}
