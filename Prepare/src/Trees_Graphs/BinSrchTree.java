package Trees_Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

//import linked_lists.LinkedList;

public class BinSrchTree extends Tree{

	public BinSrchTree(){
		super();
	}

	public BinSrchTree(int n){
		super(n);
	}
	
	public void insert(TreeNode nd, int n){
		if(n<=nd.val){
			if(nd.left == null)
				nd.left = new TreeNode(n);
			else
				insert(nd.left,n);
		}
		else{
			if(nd.right == null)
				nd.right = new TreeNode(n);
			else
				insert(nd.right,n);			
		}
	}
	
	public ArrayList<LinkedList> TreeLL (TreeNode nd){
		ArrayList<LinkedList> al = new ArrayList<LinkedList>();
		Stack<TreeNode> stk = new Stack<TreeNode>();
		Stack<Integer> deps = new Stack<Integer>();
		TreeNode current = nd;
		int cur_depth = 0;
		LinkedList<Integer> ll  = new LinkedList<Integer>();
		stk.push(current);
		deps.push(0);
		while(!stk.isEmpty()){
			current = stk.pop();
			cur_depth = deps.pop();
			if(current.left != null){
				stk.push(current.left);
				deps.push(cur_depth+1);
			}
			if(current.right != null){
				stk.push(current.right);
				deps.push(cur_depth+1);
			}
			if((al.size()-1) >= cur_depth){
				al.get(cur_depth).add(current.val);
			}
			else{
				ll = new LinkedList();
				ll.add(current.val);
				al.add(cur_depth, ll);
			}
		}
		return al;
	}
}
