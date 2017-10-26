
// NodeFormatter is an object of any class that implements NodeFormatter

// Interpretation: Formats the nodes in AST to simplify the data structure
// before comparing
public interface NodeFormatter {

	// Simplify the given node to the required structure for using in bipartite matching
	void formatNode(Object obj);
}