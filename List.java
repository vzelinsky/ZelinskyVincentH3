public class List {
  //fields
  private Node head;
  private Node tail;
  
  //constructors
  public List() {
    this.head = null;
    this.tail = null;
  }
  
  //methods
  //getters
  public String getHeadData() {
    return head.getData();
  }
  public String getTailData() {
    return tail.getData();
  }
  //adds a node to the head of the list and passes a String to it
  //more comments
  public void addNode(String dataInput) {
    if (head == null) {
      head = new Node(dataInput);
      tail = head;
    }
    else {
      Node t = head;
      while((t.getData()).compareTo(dataInput) < 0) {
        if(t.getNext() == null) {
          Node n = new Node(dataInput, null, tail);
          tail.setNext(n);
          tail = tail.getNext();
          break;
        }
        else if((t.getNext().getData()).compareTo(dataInput) >= 0) {
          Node j = t.getNext();
          Node n = new Node(dataInput, j, t);
          t.setNext(n);
          j.setPrev(t.getNext());
          break;
        }
        else {
          t = t.getNext();
        }
      }
      //FIX set prev for this... or do i?
      if((t.getData()).compareTo(dataInput) >= 0) {
          Node j = head;
          head = new Node(dataInput, j, null);
          j.setPrev(head);
      }
    }
  }
  
  //traverses list and prints
  public void printList() {
    Node ref = head;
    while (ref != null) {
      System.out.println(ref.getData());
      ref = ref.getNext();
    }
  }
  //traverses list and prints backwards
  public void printListb() {
    Node ref = tail;
    while (ref != null) {
      System.out.println(ref.getData());
      ref = ref.getPrev();
    }
  }
}