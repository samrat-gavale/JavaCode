package stacks_queues;

import java.util.Scanner;

public class TestTowerOfHanoi {
	public static void main(String args[]){
		TowersOfHanoi twrs = new TowersOfHanoi(3);
		int choice,n;
		Scanner s = new Scanner(System.in);
		while(true)
		{
			choice = s.nextInt();
			switch(choice)
			{
				case 1:
					n = s.nextInt();
					twrs = new TowersOfHanoi(n);
					break;
				case 2:
					n = twrs.move_discs(twrs.a, twrs.c, twrs.a.size());
					System.out.print("The number of steps required is "+n+"\n");
					break;
				case 3:
					twrs.print_towers();
					break;
				default:
					System.out.print("Please enter a valid option");
			}
		}
	}
}
