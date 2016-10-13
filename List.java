public class List {
  //fields
  Node head;
  
  //constructors
  public List() {
    this.head = null;
  }
  
  //methods
  //adds a node to the head of the list and passes a String to it
  public void addNode(String dataInput) {
    this.head = new Node(dataInput);
    //FIX: just adds node to head and overwrites the previous head
  }
  
  //traverses list and prints
  public void printList() {
    Node ref = head;
    while (ref != null) {
      System.out.println(ref.data);
      ref = ref.next;
    }
  }
}