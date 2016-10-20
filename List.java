/* List.java
 * Written by Vincent Zelinsky
 * 
 * Contains the necessary methods to create a Doubly Linked List, interacts with Node.java
 */
public class List {
  //Private fields
  //Contains a reference to the head Node object
  private Node head;
  //Contains a reference to the tail Node object
  private Node tail;
  
  //Constructors
  //No argument constructor that when called creates an empty List
  public List() {
    //Sets head to null
    this.head = null;
    //Sets tail to null
    this.tail = null;
  }
  
  //Methods
  //Getter methods
  //Returns the reference to the Node stored at head
  public Node getHead() {
    return head;
  }
  //Returns the reference to the Node stored at tail
  public Node getTail() {
    return tail;
  }
  
  //addNode method
  /* Adds a Node to the List in alphabetical order
   * Compares Strings of pre-existing Nodes with the String passed in the argument with the compareTo method
   * Sorts where the new Node should go depending on the output returned by compareTo and its relationship to 0
   */
  public void addNode(String dataInput) {
    //Case 1: if the List is empty (head = null)
    //Inserts the new Node at head and makes it the tail as it is the only Node
    if (head == null) {
      //Add the Node as the head
      head = new Node(dataInput);
      //Set the tail to the same Node as head
      tail = head;
    }
    else {
      //Initializes a traversal Node, t, at head
      Node t = head;
      //While the String stored in Node t compared to the argument passed to the method returns a negative (A.compareTo(B)==-1) loop
      /*(While the String stored in Node t is alphabetically less than the argument (a<b) loop)
       */ 
      while((t.getData()).compareTo(dataInput) < 0) {
        //Case 2: if next Node is null (if the tail is alphabetically less than the argument)
        //Inserts the new Node at tail.next and makes it the new tail
        if(t.getNext() == null) {
          //Creates a new Node and calls the second constructor in Node
          //The argument gets passed as the String, the next Node is null, and the prev Node is the tail 
          Node n = new Node(dataInput, null, tail);
          //The new Node is added as the next Node of the current tail
          tail.setNext(n);
          //The new Node is the new tail
          tail = tail.getNext();
          //Breaks the loop
          break;
        }
        //Case 3: if the String stored in the next Node after Node t compared to the argument returns a positive (C.compareTo(B)==1)
        /* (if the String stored in the next Node after Node t is alphabetically greater than the argument (c>b) 
         * then the argument must be between Node t and Node t.next)
         */
        //Inserts the new Node between Node t and Node t.next
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