package career_cup;

public class RemoveDuplicates {

	public static void main(String args[]){
		int arr[] = {1,2,5,9,3,1,8,4,5,4,1};
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+ arr[i]);
		System.out.println();
		removeDuplicates(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+ arr[i]);
		System.out.println();
	}

	/*following function removes duplicates from the array in order n.
	 * It uses O(n) memory
	 * I am assuming that all the integers are less than 10 and >= 0
	 */
	public static void removeDuplicates(int arr[]){
		int i,j;
		int chars[] = new int[10];
		for(i=0;i<10;i++)
			chars[i] = 0;
		for(i = 0,j = 0; i < arr.length; i++){
			if(chars[arr[i]] == 0){
				chars[arr[i]]++;
				arr[j++] = arr[i];
			}
		}
		for(i=j;i<arr.length;i++)
			arr[i] = -1;
	}
}
