package recursion;

public class NQueens {
	
	static int columnForRow[] = new int [8];
	static boolean check(int row) {
		for (int i = 0; i < row; i++) {		
		int diff = Math.abs(columnForRow[i] - columnForRow[row]);
		if (diff == 0 || diff == row - i) return false;
		}
		return true;
	}
	public static void PlaceQueen(int row){
		if (row == 8) {
			printBoard();
			return;
		}
		for (int i = 0; i < 8; i++) {
			columnForRow[row]=i;
			if(check(row)){	
				PlaceQueen(row+1);
			}
		}
	}
	
	public static void printBoard(){
		int i,j;
		for(i=0;i<8;i++){
			for(j=0;j<8;j++){
				if(j == columnForRow[i])
					System.out.print("Q ");
				else
					System.out.print("_ ");
			}			
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	
	public static void main(String args[]){
		PlaceQueen(1);
	}
}
