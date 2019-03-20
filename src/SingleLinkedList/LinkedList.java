package SingleLinkedList;



public class LinkedList {
    private Link firstLink;

    // Creating a SingleLinkedList.LinkedList the first link should be null
   public  LinkedList() {
        firstLink = null;
    }

    public boolean isEmpty() {
        return (firstLink == null) ? true : false;
    }

    public void insertFirstLink(String bookName, int bookSoldInMillions) {
        Link newLink = new Link(bookName, bookSoldInMillions);
        // reference the previous  link
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public Link changeFirstLink(String bookName, int bookSoldInMillions) {
        Link linkReference = firstLink;
        if (!(isEmpty())) {
            linkReference.changeLinkData(bookName, bookSoldInMillions);
        } else {
            System.out.println("The List is list  is empty. There is no element to change");
        }
        return linkReference;
    }

    public Link removeFirstLink() {
        Link linkReference = firstLink;
        if (!isEmpty()) {
            firstLink = firstLink.next;

        } else {
            System.out.println("This List is empty");
        }
        return linkReference;
    }

    public void displayLinkedList() {
        Link theLink = firstLink;

        while (!(theLink == null)) {
            theLink.displayLink();
            if (!(theLink.next == null)) {
                System.out.println("The next link is: " + theLink.next);
            } else {
                System.out.println();
                System.out.println("There is no more elements!");
            }
            theLink = theLink.next;
            System.out.println();
        }
    }

    public Link findLink(String bookName) {
        Link theLink = firstLink;
        if (!isEmpty()) {
            while (theLink.getBookName() != bookName) {
                if (theLink.next == null)
                    return null;

                else
                    theLink = theLink.next;
            }
        } else
            System.out.println("The list is empty");
        return theLink;
    }

    public Link removeLink(String bookname) {
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        if (!isEmpty()) {
            while (currentLink.getBookName() != bookname) {
                if (currentLink.next == null) {
                    return null;
                } else {
                    previousLink = currentLink;
                    currentLink = currentLink.next;
                }
            }
            if (currentLink == firstLink) {
                firstLink = firstLink.next;
            } else {
                previousLink.next = currentLink.next;
            }
        } else
            System.out.println("This is empty list");

        return currentLink;
    }
}
