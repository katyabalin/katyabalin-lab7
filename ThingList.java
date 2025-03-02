import java.util.Random;

public class ThingList {
    private class Node {  
        Thing data;
        Node next;

        Node(Thing data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addThing(Thing thing) {  // ✅ Ensure method name matches test
        Node newNode = new Node(thing);
        newNode.next = head;
        head = newNode;
    }

    public void moveAll() {  // ✅ Ensure method name matches test
        Node current = head;
        Random rand = new Random();
        while (current != null) {
            current.data.maybeTurn(rand);
            current.data.step();
            current = current.next;
        }
    }

    public void printAll() {  // ✅ Ensure method name matches test
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("done");
        System.out.flush();
    }
}
