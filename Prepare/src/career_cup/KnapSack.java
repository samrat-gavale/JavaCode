package career_cup;

public class KnapSack {
	public static void solveKnapSack(int W, int weights[], int values[]){
		int w, i, n = weights.length;
		if(weights.length != values.length)
			return;
		int arr[][] = new int[weights.length+1][W+1];
		for(w = 0; w <= W; w++){
			arr[0][w] = 0;
		}
		for(i = 1; i <= n; i++){
			arr[i][0] = 0;
		}
		for(i = 1; i <= n; i++){
			for(w = 1; w <= W; w++){
				if(weights[i-1] <= w){// item i can be part of the solution
					if(values[i-1] + arr[i-1][w-weights[i-1]] > arr[i-1][w]){
						arr[i][w] = values[i-1] + arr[i-1][w - weights[i-1]];
//						System.out.print(" " + arr[i][w] + " values["+ (i-1) +"] = " + values[i-1]);
					}
					else
						arr[i][w] = arr[i-1][w];
				}
				else
					arr[i][w] = arr[i-1][w]; // wi > w				
			}
		}
		
		System.out.println();
		for(i = 0; i <= n; i++){
			for(w = 0; w <= W; w++){
				System.out.print(arr[i][w] + " ");
			}
			System.out.println();
		}
		int k;
		System.out.print(" weights[0] = " + weights[0]);		
		for(i = n; i > 0; i--){
			for(k = W; k > 0;){
				System.out.print("\narr["+i+"]["+k+"] = " + arr[i][k] + "  ");
				if(arr[i][k] != arr[i-1][k]){
					System.out.print(i + " weights[i-1] = " + weights[i-1] +  " i = " + i +" ");
					i = i-1;
					System.out.print(" k = " + k);
					k = k - weights[i-1];
					System.out.print(" k = " + k);
				}
				else
					i = i - 1; // Assume the ith item is not in the knapsack
			}
		}
	}
	
	public static void main(String args[]){
		int weights[] = {2,3,4,5};
		int values[] = {3,4,5,6};
		int max_wt = 5;
		solveKnapSack(max_wt,weights,values);
	}
}