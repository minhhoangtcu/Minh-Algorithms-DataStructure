package epi.linkedLists;

/**
 * Given two singly linked lists there may be list nodes that are common to
 * both. (This may not be a bug - it may be desirable from the perspective of
 * reducing memory footprint, as in the flyweight pattern, or maintaining a
 * canonical form.)
 * 
 * Write a program that takes two cycle-free singly linked lists, and determines
 * if there exists a node that is common to both lists.
 */
public class LL84_OverlappingCycleFree {
	
	public boolean isConverge(Node rootA, Node rootB) {
		return getLastNode(rootA) == getLastNode(rootB);
	}
	
	public Node getLastNode(Node root) {
		
		Node runner = root;
		
		while (runner != null && runner.next != null) {
			runner = runner.next;
		}
		
		return runner;
	}

}
