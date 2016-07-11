package tree;

public abstract class AbstractNode implements TreeNode {
	
	protected TreeNode left, right;
	
	public AbstractNode (TreeNode left, TreeNode right) {
		
		if (left == null || right == null) 
			throw new RuntimeException("Use EmptyNode.empty instead null");
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int size() {
		//size von links + 1 + size von rechts
		//rekursiv die size - methode aufrufen
		
		return left.size() + 1 + right.size() ;
	}

	@Override
	abstract public void process();

	@Override
	public void processAllInOrder() {
		left.processAllInOrder();
		process();
		right.processAllInOrder();
		
	}

	@Override
	public void processAllPreOrder() {
		process();
		left.processAllPreOrder();
		right.processAllPreOrder();
	}

	@Override
	public void processAllPostOrder() {
		left.processAllPostOrder();
		right.processAllPostOrder();
		process();
		
	}
	
	public boolean contains (int v) {
		return false;
	}

}
