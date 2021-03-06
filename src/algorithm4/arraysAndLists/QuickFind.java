package algorithm4.arraysAndLists;

public class QuickFind {
	
	private int[] sites;
	private int numberOfComponents;
	
	public static void main(String[] args) {
		
		QuickFind uf = new QuickFind(10);
		uf.union(4, 7);
		uf.union(9, 8);
		uf.union(0, 9);
		uf.union(8, 6);
		uf.union(5, 3);
		uf.union(9, 5);
		uf.printSites();
		
	}
	
	public QuickFind(int size) {
		sites = new int[size];
		numberOfComponents = size;
		for (int i = 0; i < size; i++) {
			sites[i] = i;
		}
	}
	
	public void union(int p, int q) {
		int rootQ = find(q);
		int rootP = find(p);
		
		if (rootQ == rootP)
			return;
		
		for (int i = 0; i < sites.length; i++) {
			if (sites[i] == rootP)
				sites[i] = rootQ;
		}
		numberOfComponents--;
	}
	
	public int find(int p) {
		return sites[p];
	}
	
	public void printSites() {
		for (int i = 0; i < sites.length; i++) {
			System.out.printf("%d ", sites[i]);
		}
		System.out.println();
	}

}
