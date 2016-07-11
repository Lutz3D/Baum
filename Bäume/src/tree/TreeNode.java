package tree;

public interface TreeNode {
	
	public boolean isEmpty();
	public int size();
	
	public void process();
	
	
	public void processAllInOrder();
	public void processAllPreOrder();
	public void processAllPostOrder();
	
	public int eval ();
	
	public TreeNode addSorted (int value);
	
	public boolean contains (int v);
	
	/*Bäume ausgeben, ProcessAll in Order
	processAll in Order
	Process all PreOrder
	process allPostOrder
	
	*/
}
