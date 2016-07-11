package tree;

public class PlusNode extends AbstractNode{
	
	public PlusNode(TreeNode left, TreeNode right) {
		super(left,right);

	}
@Override
public void process () {
	System.out.println("+");
	
	
}
@Override
public int eval () {
	return left.eval() +  right.eval();
}
@Override
public TreeNode addSorted(int value) {
	return left;
	// TODO Auto-generated method stub
	
}

}
