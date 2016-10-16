public class List {
  //fields
  Node head;
  Node tail;
  
  //constructors
  public List() {
    this.head = null;
    this.tail = null;
  }
  
  //methods
  //adds a node to the head of the list and passes a String to it
  public void addNode(String dataInput) {
    if (head == null) {
      head = new Node(dataInput);
      tail = head;
      System.out.println("head"+head.data);
      System.out.println("tail"+tail.data);
    }
    else {
      tail.next = new Node(dataInput);
      tail = tail.next;
    }
    //FIXED?: just adds node to head and overwrites the previous head
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