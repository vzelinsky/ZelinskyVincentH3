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
    //myList.addNode("Barb");
    //myList.addNode("Earl");
    myList.printList();
    System.out.println("head"+myList.head.data);
    System.out.println("tail"+myList.tail.data);
  }
}