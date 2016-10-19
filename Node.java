public class Node {
  //fields
  private String data;
  private Node next;
  private Node prev;
  
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
  
  //getter methods
  public String getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }
  public Node getPrev(){
    return prev;
  }
  //setter methods
  public void setData(String dataInput){
    this.data = dataInput;
  }
  public void setNext(Node nextInput){
    this.next = nextInput;
  }
  public void setPrev(Node prevInput){
    this.prev = prevInput;
  }
}