package stacks_queues;
import java.util.ArrayList;
import java.util.Stack;


public class SetOfStacks {
	private static final int MAX_SIZE = 3;
	ArrayList<Stack> Set = new ArrayList<Stack>();
	SetOfStacks(){
		Set = new ArrayList<Stack>();
		Stack stk = new Stack();
		Set.add(stk);
	}
	
	void push(int n){
		Stack new_stk = new Stack();
		if(Set.get(this.Set.size()-1).size() == MAX_SIZE){
			new_stk.push(n);
			this.Set.add(new_stk);
			System.out.print("New stack added\n");
		}
		else{
			if(Set.size() == 0)
				new_stk = new Stack();
			else
				new_stk = Set.remove(Set.size()-1);
			new_stk.push(n);
			Set.add(new_stk);
		}		
	}
	int pop(){
		if(Set.size() == 0){
			System.out.print("Stack is empty!\n");
			return 0;			
		}
		int n = (Integer) Set.get(Set.size()-1).pop();
		if(Set.get(Set.size()-1).size() == 0){
			Set.remove(Set.size()-1);
			System.out.print("Stack removed\n");
		}
		return  n;
		
	}
	
	void print(){
		if(Set.size() == 0){
			System.out.print("The stack is empty!\n");
			return;
		}
		else{
			int i;
			for(i=0;i<Set.size();i++)
				this.print_stack(i+1);
			System.out.print("\n");
		}
	}

	void print_stack(int indx){
		if(Set.size() == 0){
			System.out.print("The set of stacks is empty!\n");
			return;
		}
		else if(indx>Set.size()){
			System.out.print("There is not stack at this index.\n");
			return;
		}
		else{
			int temp;
			Stack temp_stk = new Stack();
			Stack new_stk = Set.get(indx-1);
			if(new_stk.isEmpty()){
				System.out.print("The stack at this index is empty\n");
				return;
			}
			while(!new_stk.isEmpty()){
				temp = (Integer) new_stk.pop();
				temp_stk.push(temp);
			}
			while(!temp_stk.isEmpty()){
				temp = (Integer) temp_stk.pop();
				System.out.print(temp + " ");
				new_stk.push(temp);
			}
			System.out.print("\n");
		}
	}
}
