import java.util.ArrayList;

// Algorithm is an object of any class that implements Algorithm interface

// Interpretation: Algorithm represents core algorithm implemented for comparing ASTs
public interface Algorithm {

	// Runs the algorithm on list of ASTs
	void run(ArrayList<Object> lon);
	
	// Saves the results of the run
	void saveOutput();
	
}