package stacks_queues;
import java.util.Scanner;



public class TestStack {
	public static void main(String args[]){
		int choice = 0, n = 0;
		StackWithMin stk = new StackWithMin();
		Scanner s = new Scanner(System.in);
		while(true)
		{
			choice = s.nextInt();
			switch(choice)
			{
				case 1:
					n = s.nextInt();
					stk.push(n);
					break;
				case 2:
					System.out.print("Popped - " + stk.pop() + "\n");
					break;
				case 3:
					System.out.print("Peek - " + stk.peek() + "\n");
					break;
				case 4:
					System.out.print("Min - " + stk.min() + "\n");
					break;
				case 5:
					stk.print();
					break;
				default:
					System.out.print("Please enter a valid option");
			}
		}
	}
}
