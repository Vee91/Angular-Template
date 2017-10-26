import java.util.HashMap;

// This class represents Fibonacci Heap data structure and is implemented using 
// pseudo code provided in the book Introduction to Algorithms by Cormen, Thomas H.
// which is available in NU library or online
public class FibHeap {

	private static class FibNode {

		private Object obj;
		private int key;
		private FibNode parent;
		private FibNode child;
		private FibNode left;
		private FibNode right;

		// indicates whether this node has lost a child since the last time 
		// this node was made the child of another node. 
        // A node can lose a child when we use the decrease key operation.
		private boolean mark;
		private int degree; // degree of this node. Represents how many child nodes 
		                    // are connected to this node

		public FibNode(Object object, int key) {
			this.obj = object;
			this.key = key;

			parent = child = null;
			left = right = this;

			mark = false;
			degree = 0;

		}
	}

	// min node of this heap. H.min from the book
	private FibNode min;
	
	// represents mapping of object to a Node(in turn key in the node) contains every node.
	// Not just the root list from the book.
	// Please note that Node itself has object and key but this is also maintained explicitly
	private HashMap<Object, FibNode> objectToNode;
	
	// number of nodes in this heap. H.n from the book
	private int noOfNodes;

	public FibHeap(int maxSize) {
		min = null;
		noOfNodes = 0;
		objectToNode = new HashMap<Object, FibNode>(maxSize);

	}
	
	// following method extracts the minimum node and consolidates the trees
	public Object extractMin() {
		return null;
	}
	
	// following method makes a node using given object and key and inserts into this heap
	public void insert(Object obj, int key) {
		
	}
	
	// following method removes a node with given object and key mapping from this heap
	public void decreaseKey(Object obj, int key) {
		
	}

}
