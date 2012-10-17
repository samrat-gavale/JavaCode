package career_cup;

import java.util.Collections;

/* following program find the pairs from a given 
 * array whose sum is given number
 */
public class PairsSum1911 {

	public static void main(String args[]){
		int arr[] = { -2, -1, 0, 3, 5, 6, 7, 9, 13, 14};
//{1,2,3,4,6,7,9};
		findPairs(arr,11);
	}
	
	public static void findPairs(int arr[], int sum){
		int first = 0;
		int last = arr.length-1;
		int s = 0;
//		Collections.sort(arr);
		while(first < last){
			s = arr[first] + arr[last];
			if(s == sum){
				System.out.print(" {"+ arr[first] + "," + arr[last] +"} ");
				first++;
				last--;
			}
			else if( s < sum)
				first++;
			else
				last--;
		}
	}
}
