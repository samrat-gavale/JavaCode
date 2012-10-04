package Trees_Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TestBinTree {
	public static void main(String args[]){
		int choice = 0, n = 0;
		BinSrchTree bst = new BinSrchTree(8);
		ArrayList<LinkedList> arlst;
		LinkedList ll;
		Scanner s = new Scanner(System.in);
		while(true)
		{
			choice = s.nextInt();
			switch(choice)
			{
				case 1:
					n = s.nextInt();
					bst = new BinSrchTree(n);
					break;
				case 2:
					n = s.nextInt();
					bst.insert(bst.Root, n);
					break;
				case 3:
					bst.printGraphical(bst.Root, 0);
					break;
				case 4:
					arlst = bst.TreeLL(bst.Root);
					n = 0;
					for(n = 0;n<arlst.size();n++)
					{
						ll = arlst.get(n);
						while(ll.size()>0)
							System.out.print(ll.pop()+" ");
						System.out.print("\n");
					}
					break;
				default:
					System.out.print("Please enter a valid choice.\n");
			}
		}
	}

}
