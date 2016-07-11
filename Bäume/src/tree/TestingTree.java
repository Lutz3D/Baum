package tree;

public class TestingTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberNode zwölf = new NumberNode (12);
		NumberNode drei = new NumberNode (3);
		NumberNode root = new NumberNode (10, drei, zwölf);
		//PlusNode root = new PlusNode (new NumberNode (3), new MultiplicationNode(new NumberNode(7)));
		
		TreeNode root2 = EmptyNode.empty;
		root2 = root2.addSorted(30);
		root2 = root2.addSorted(12);
		root2 = root2.addSorted(10);
		root2 = root2.addSorted(13);
		root2 = root2.addSorted(12);
		root2 = root2.addSorted(11);
		
		
		System.out.println("In Order:");
		root2.processAllInOrder();
		System.out.println("\n\nPre Order:");
		root2.processAllPreOrder();
		System.out.println("\n\nPost Order:");
		root2.processAllPostOrder();


		//AbstractNode node = new AbstractNode (zwölf, EmptyNode.empty);

	}

}
