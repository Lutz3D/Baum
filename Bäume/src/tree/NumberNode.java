package tree;

public class NumberNode extends AbstractNode{
	
	private int value;

	public NumberNode(int value, TreeNode left, TreeNode right) {
		super(left, right);
		this.value = value;
		// TODO Auto-generated constructor stub
	}
	
	public NumberNode (int value) {
		this (value, EmptyNode.empty, EmptyNode.empty);
	}

	@Override
	public void process() {
		System.out.print(" " + value + " ");
		
		
	}

	@Override
	public int eval() {
		return value;
	}

	@Override
	public TreeNode addSorted(int value) {
		if (value< this.value) {
			left = left.addSorted(value);
		} else {
			right = right.addSorted(value);
		}
		return this;
		// TODO Auto-generated method stub
		
	}

	
	public boolean contains (int v) {
		//Allgemeiner Fall - gilt für alle Bäume
		return this.value == v || 
				left.contains(v) ||
				right.contains(v);
				
		//für sortierte Bäume effizienter:
		//return this.value == v ||
		//v < this.value ? left.contains(v) : right.contains(v);
	}
	
}
