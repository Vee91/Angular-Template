import java.util.HashMap;

public class FibHeap {

	private static class FibNode {

		private Object obj;
		private int key;
		private FibNode parent;
		private FibNode child;
		private FibNode left;
		private FibNode right;

		private boolean mark;
		private int degree;

		public FibNode(Object object, int key) {
			this.obj = object;
			this.key = key;

			parent = child = null;
			left = right = this;

			mark = false;
			degree = 0;

		}
	}

	private FibNode min;
	private HashMap<Object, FibNode> objectToNode;
	private int noOfNodes;

	public FibHeap(int maxSize) {
		min = null;
		noOfNodes = 0;
		objectToNode = new HashMap<Object, FibNode>(maxSize);

	}
	
	public Object extractMin() {
		return null;
	}
	
	public void insert(Object obj, int key) {
		
	}
	
	public void decreaseKey(Object obj, int key) {
		
	}

}
