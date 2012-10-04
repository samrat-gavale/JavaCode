package linked_lists;
import java.util.Scanner;


public class TestLinkedList {
	public static void main(String args[]){
		int choice = 0, n = 0;
		LinkedList l = null;
		Scanner s = new Scanner(System.in);
		while(true)
		{
			choice = s.nextInt();
			switch(choice)
			{
				case 1:
					n = s.nextInt();
					l = new LinkedList(n);
					break;
				case 2:
					n = s.nextInt();
					l.append(n);
					break;
				case 3:
					l.create_circle();
					break;
				case 4:
					l.print_list();
					break;
				case 5:
					l.print_node(l.find_circle());
					break;
				case 6:
					l.reverse();
					break;
			}
		}
	}
}
