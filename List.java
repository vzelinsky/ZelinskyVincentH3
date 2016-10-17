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
        else if((t.data).compareTo(dataInput) >= 0) {
          //FIX doesn't catch Abel
          System.out.println("I've caught Abel");
          Node j;
          j = head;
          head = new Node(dataInput);
          head.next = j;
          break;
        }
        else if((t.next.data).compareTo(dataInput) >= 0) {
          Node j;
          j = t.next;
          t.next = new Node(dataInput);
          t.next.next = j;
          break;
        }
        else {
          t = t.next;
        }
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