package tree;

public class EmptyNode implements TreeNode{
	
	
	static final TreeNode empty = new EmptyNode();
	
	private EmptyNode () {
		
	}

	@Override
	public boolean isEmpty() {
		
		return true;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void process() {
		
	}

	@Override
	public void processAllInOrder() {
		
	}

	@Override
	public void processAllPreOrder() {
		
	}

	@Override
	public void processAllPostOrder() {
		
	}

	@Override
	public int eval() {
		throw new RuntimeException("Leerer Baum nicht evalierbar");
	}

	@Override
	public TreeNode addSorted(int value) {
		
		
		return new NumberNode(value);
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException();
	}

	@Override
	public boolean contains(int v) {
		// TODO Auto-generated method stub
		return false;
	}

}
