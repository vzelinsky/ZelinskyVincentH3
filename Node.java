public class Node {
  //fields
  String data;
  Node next;
  Node prev;
  
  //constructors
  public Node(String dataInput) {
    this.data = dataInput;
    this.next = null;
    this.prev = null;
  }
  
  public Node(String dataInput, Node n, Node p) {
    this.data = dataInput;
    this.next = n;
    this.prev = p;
  }
  
  //methods
}