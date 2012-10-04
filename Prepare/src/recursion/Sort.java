package recursion;
/* swaps in ascending order */
public class Sort {
	public static void main(String args[]){

		int[] arr = {30, 12, 18, 0, -5, 72, 424};
		int i,j,sz = 7,temp;
		for(i=0;i<sz;i++)
		{
			for(j=i+1;j<sz;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(i=0;i<sz;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
