import java.util.Random;

public class ThingList {
    // private inner class that represents a node in the linked list
    private class Node {  
        Thing data;
        Node next;
        // constructor that initializes a node with a thing object
        Node(Thing data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // reference to the first node in the linked list
    private Node head;

    // adds a new thing object to the start of the list
    public void addThing(Thing thing) {
        Node newNode = new Node(thing);
        newNode.next = head;
        head = newNode;
    }
    
    // moves all thing objects in the list by making random directional changes
    public void moveAll(Random rand) {  
        Node current = head;
        while (current != null) {
            current.data.maybeTurn(rand); // determines if the thing should change direction
            current.data.step(); // moves the thing forward based on its direction
            current = current.next;
        }
    }

    // prints all thing objects stored in the list
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data); // displays the current thing's details
            current = current.next;
        }
        System.out.println("done"); // signals the end of the list output
        System.out.flush();
    }
}
