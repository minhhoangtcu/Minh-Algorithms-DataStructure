package epi.linkedLists;

public class BasicList {
  
  public static Node create(int[] ids) {
    Node root = new Node();
    root.id = ids[ids.length - 1];
    
    for (int i = ids.length - 2; i >= 0; i--) {
      Node temp = new Node();
      temp.id = ids[i];
      temp.next = root;
      root = temp;
    }
    
    return root;
  }
  
  public static void print(Node n) {
    Node runner = n;
    while (runner != null) {
      System.out.format("%d ", runner.id);
      runner = runner.next;
    }
    System.out.println();
  }

}
