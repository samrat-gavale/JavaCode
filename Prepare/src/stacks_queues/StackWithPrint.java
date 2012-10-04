package stacks_queues;

import java.util.Stack;

public class StackWithPrint extends Stack{
	int num  = 0;
	public StackWithPrint(){
		super();
	}
	public StackWithPrint(int n){
		super();
		num = n;
	}
	
	public void print(){
		Stack temp = new Stack();
		int temp_int;
		while(!this.isEmpty()){
			temp.push(this.pop());
		}
		while(!temp.isEmpty()){
			temp_int = (Integer) temp.pop();
			System.out.print(temp_int + " ");
			this.push(temp_int);
		}
	}
}
