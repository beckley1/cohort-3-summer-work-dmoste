public class Driver{
  public static void main(String[] args) {

    //Create node setup
    Node p = new Node("5");
    Node a = new Node("10");
    Node b = new Node("15");
    Node c = new Node("20");

    p.setNext(a);
    a.setNext(b);
    b.setNext(c);

    //Create a new Node variable set it to point to the node with the 10 in it.
    Node d = p.getNext();

    //Create a new Node variable and instantiate it to a new Node with a value of 30.
    Node e = new Node("30");

    //Write the code to insert this new Node between the 10 and the 15
    e.setNext(p.getNext().getNext());
    p.getNext().setNext(e);
    
    System.out.println(p.getData());
    System.out.println(p.getNext().getData());
    System.out.println(p.getNext().getNext().getData());
    System.out.println(p.getNext().getNext().getNext().getData());
    System.out.println(p.getNext().getNext().getNext().getNext().getData());
  }
}
