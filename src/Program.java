import SingleLinkedList.Link;
import SingleLinkedList.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList theLinkedList = new LinkedList();

        theLinkedList.insertFirstLink("Don Quixote", 500);
        theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
        theLinkedList.insertFirstLink("The Lord of the Rings", 200);
        theLinkedList.insertFirstLink("Harry Potter and the Socerer's Stone", 107);

        theLinkedList.displayLinkedList();
        Link removeAtTOTC = theLinkedList.removeLink("A Tale of Two Cities");
        System.out.println();

        System.out.println("Removed " + removeAtTOTC);

        System.out.println();

        System.out.println("Changed the first SingleLinkedList.Link to : " + theLinkedList.changeFirstLink("To Kill a Mockingbird", 1));

        System.out.println();

        System.out.println("Deleted first link which out " + theLinkedList.removeFirstLink());
        System.out.println();
        System.out.println("Found " + theLinkedList.findLink("The Lord of the Rings"));

        theLinkedList.displayLinkedList();


    }
}
