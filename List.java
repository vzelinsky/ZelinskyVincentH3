import java.util.Scanner;
public class List {
  //fields
  Node head;
  Scanner scanner = new Scanner(System.in);
  
  //constructors
  public List() {
    this.head = null;
  }
  
  //methods
  //adds a node to the head of the list and passes a String to it
  public String addNode() {
    return scanner.nextLine();
  }
  public void addNode(String dataInput) {
    this.head = new Node(dataInput);
  }
}