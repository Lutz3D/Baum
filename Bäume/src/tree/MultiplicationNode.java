package tree;

public class MultiplicationNode extends AbstractNode {

	/**
	 * @param args
	 */
public MultiplicationNode(TreeNode left, TreeNode right) {
		super(left,right);

	}
@Override
public void process () {
	System.out.println("*");
	
	
}
@Override
public int eval () {
	return left.eval() * right.eval();
}
@Override
public TreeNode addSorted(int value) {
	return left;
	// TODO Auto-generated method stub
	
}

}
