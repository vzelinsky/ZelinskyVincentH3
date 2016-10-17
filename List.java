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
  //more comments
  public void addNode(String dataInput) {
    if (head == null) {
      head = new Node(dataInput);
      tail = head;
    }
    else {
      Node t;
      t = head;
      while((t.data).compareTo(dataInput) < 0) {
        if(t.next == null) {
          tail.next = new Node(dataInput);
          tail = tail.next;
          break;
        }
        else {
          t = t.next;
        }
      }
      if((t.data).compareTo(dataInput) > 0) {
          System.out.println("I've caught Barb");
          //if t == head
          //else xyz
      }
    }
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