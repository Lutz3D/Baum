package tree;

public class SortedTree {

		TreeNode root = EmptyNode.empty;
		
		public void addSorted (int value) {
			root = root.addSorted(value);
		}
	
}
