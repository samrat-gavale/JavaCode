package career_cup;

public class PrintSpiral {
	public static void printRange(int arr[][], int strt, int end, int constant, int rc){
		int i;
		if(strt<=end){
			if(rc == 0)
				for(i=strt;i<=end;i++)
					System.out.print(" " + arr[constant][i]);
			else
				for(i=strt;i<=end;i++)
					System.out.print(" " + arr[i][constant]);
				
		}
		else{
			if(rc == 0)
				for(i=strt;i>=end;i--)
					System.out.print(" " + arr[constant][i]);
			else
				for(i=strt;i>=end;i--)
					System.out.print(" " + arr[i][constant]);
							
		}
	}
	
	public static void printSpiral(int arr[][], int sz1, int sz2){
		int lbot = sz1 - 1;
		int ltop = 0;
		int lleft = 0;
		int lright = sz2 - 1;
		int counter = 0;
		for(;ltop <= lbot && lleft <= lright;){
			switch(counter % 4){
			case 0:
				printRange(arr,lleft,lright,ltop,0);
				ltop++;
				break;
			case 1:
				printRange(arr,ltop,lbot,lright,1);
				lright--;
				break;
			case 2:
				printRange(arr,lright,lleft,lbot,0);
				lbot--;
				break;
			case 3:
				printRange(arr,lbot,ltop,lleft,1);
				lleft++;
				break;
			default:
				break;
			}
			counter++;
		}
	}
	
	public static void main(String args[]){
		int arr[][] = {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
		printSpiral(arr,4,4);
	}
}