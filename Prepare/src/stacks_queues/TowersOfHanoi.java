package stacks_queues;

import java.util.Stack;

public class TowersOfHanoi {
	StackWithPrint a = new StackWithPrint(1);
	StackWithPrint b = new StackWithPrint(2);
	StackWithPrint c = new StackWithPrint(3);
	
	public TowersOfHanoi(int n){
		this.add_disks(n);
	}
	
	public void add_disks(int n){
		int i;
		for(i=n;i>0;i--){
			a.push(i);
		}
	}
	
	public void print_tower(int n){
		System.out.print("--");
		switch(n){
			case 1:
				a.print();
				break;
			case 2:
				b.print();
				break;
			case 3:
				c.print();
				break;
			default:
				System.out.print("There is no tower no. " + n);
		}
		System.out.print("\n");
	}
	
	public void print_towers(){
		System.out.print("\n");
		print_tower(1);
		print_tower(2);
		print_tower(3);
	}
	
	public int move_discs(StackWithPrint t1, StackWithPrint t2, int num_discs){
		if(t1 == t2)
			return 0;
		StackWithPrint t3;
		if(t1 != a && t2 != a)
			t3 = a;
		else if(t1 != b && t2 != b)
			t3 = b;
		else
			t3 = c;
		
		if(num_discs > 3){
			move_discs(t1,t3,(num_discs-1));
			move_top_disc(t1,t2);
			move_discs(t3,t2,(num_discs-1));
		}
		else if(num_discs == 3){
			move_top_disc(t1,t2);
			move_top_disc(t1,t3);
			move_top_disc(t2,t3);
			move_top_disc(t1,t2);
			move_top_disc(t3,t1);
			move_top_disc(t3,t2);
			move_top_disc(t1,t2);
		}
		else if(num_discs == 2){
			move_top_disc(t1,t3);
			move_top_disc(t1,t2);
			move_top_disc(t3,t2);
		}
		else
			move_top_disc(t1,t2);
		return (int) (Math.pow(2,num_discs) - 1);
	}
	
	public void move_top_disc(StackWithPrint t1, StackWithPrint t2){
		if(t1.size()<1){
			System.out.print("Tower "+t1.num+" is empty.\n");
			return;
		}
		else{
			t2.push(t1.pop());
			print_towers();
		}
	}
}
