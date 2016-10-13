public class Node {
  //fields
  String data;
  Node next;
  
  //constructors
  public Node(String dataInput) {
    this.data = dataInput;
    this.next = null;
  }
  
  public Node(String dataInput, Node n) {
    this.data = dataInput;
    this.next = n;
  }
  
  //methods
}