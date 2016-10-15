/* LinkedLists.java
 * Written by Vincent Zelinsky
 * 
 * Tests methods of ...
 */
public class LinkedLists
{
  public static void main (String[] args)
  {
    List myList = new List();
    myList.addNode("Anne");
    myList.addNode("Charlie");
    myList.addNode("Earl");
    myList.printList();
    
    Node n1 = new Node("Anne");
    Node n2 = new Node("Charlie");
    Node n3 = new Node("Earl");
    System.out.println(n1.data+"\n"+n2.data+"\n"+n3.data);
  }
}