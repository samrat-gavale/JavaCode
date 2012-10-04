package stacks_queues;
import java.util.Scanner;


public class TestSetOfStacks {
	public static void main(String args[]){
		int choice = 0, n = 0;
		SetOfStacks st = new SetOfStacks();
		Scanner s = new Scanner(System.in);
		while(true)
		{
			choice = s.nextInt();
			switch(choice)
			{
				case 1:
					n = s.nextInt();
					st.push(n);
					break;
				case 2:
					System.out.print("Popped - " + st.pop() + "\n");
					break;
				case 3:
					n = s.nextInt();
					st.print_stack(n);
					break;
/*				case 4:
					System.out.print("Min - " + stk.min() + "\n");
					break;
*/				case 5:
					st.print();
					break;
				default:
					System.out.print("Please enter a valid option");
			}
		}
	}

}
