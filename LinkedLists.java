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
    myList.addNode("Joe");
    myList.addNode("Anne");
    myList.addNode("Charlie");
    myList.addNode("Bart");
    myList.addNode("Earl");
    myList.addNode("Abel");
    myList.addNode("Delta");
    myList.addNode("Zack");
    myList.printList();
    System.out.println("---------------------------------");
    myList.printListb();
  }
}