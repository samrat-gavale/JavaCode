package career_cup;

public class MaxSequence {

	public static int maxSequence(int arr[]){
		int sum = 0, max_sum = 0;
		int strt = 0, end = 0, max_strt = 0;
		for(int i = 0;i < arr.length; i++){
			sum += arr[i];
			if(sum < 0){
				sum = 0;
				strt = i+1;   //the max array is not the current one, it might start from next
			}
			if(max_sum < sum){
				max_sum = sum;
				max_strt = strt;
				end = i;
			}
		}
		System.out.print("max sum = "+ max_sum + " strt = " + max_strt + " end = " + end + "\n");
		return max_sum;
	}
	
	public static void main(String args[]){
		int arr[] = {2, -8, 3, -2, 4, -10};
		maxSequence(arr);
	}
}
