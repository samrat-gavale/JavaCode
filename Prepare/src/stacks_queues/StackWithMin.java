package stacks_queues;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;


public class StackWithMin extends Stack<Integer>{
	Stack<Integer> Mins;
	public StackWithMin(){
		Mins = new Stack<Integer>();
	}
	
	public void push(int n){
		super.push(n);
		if(Mins.isEmpty()){ 
			Mins.push(n);
			System.out.print("min pushed\n");
		}
		else if(Mins.peek() >= n){
			Mins.push(n);
			System.out.print("min pushed 2\n");
		}
	}
	
	public Integer pop(){
		if(this.isEmpty())
			return 0;
		int n = super.pop();
		if(n == min()){
			Mins.pop();
		}
		return n;
	}
	
	public int min(){
		if(this.isEmpty()){
			return -1;
		}
		else
			return Mins.peek();
	}
	
	public void print(){
		if(this.isEmpty())
			return;
		StringBuffer buf = new StringBuffer();
		Stack<Integer> new_stk = new Stack<Integer>();
		Integer temp = null;
		while(!this.isEmpty()){
			temp = this.pop();
			buf.append(temp+" ");
			new_stk.push(temp);
		}
		System.out.print(buf.reverse()+"\n");
		while(!new_stk.isEmpty()){
			temp = new_stk.pop();
			this.push(temp);
		}
	}
}
