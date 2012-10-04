package Trees_Graphs;

public class Tree {
	TreeNode Root = null;
	int height = 0;
	
	public Tree(){
		
	}
	
	public Tree(int n){
		Root = new TreeNode(n);
	}
	
	public void printGraphical(TreeNode nd, int spaces){
		if(nd.left != null)
			this.printGraphical(nd.left, spaces+1);
		int temp = spaces;
		while((temp--) > 0)
			System.out.print("  ");
		System.out.print(nd.val+"\n");
		if(nd.right != null)
			this.printGraphical(nd.right, spaces+1);
	}
}
