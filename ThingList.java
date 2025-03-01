public class ThingList {
    private static class Node {
        Thing data;
        Node next;

        Node(Thing data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public ThingList() {
        this.head = null;
    }

    public void addAll(Thing thing) {  /
        Node newNode = new Node(thing);
        newNode.next = head;
        head = newNode;
    }

    public void moveAll() {
        for (Node current = head; current != null; current = current.next) {
            current.data.decideTurn();
            current.data.step();
        }
    }

    public void printAll() {  
        for (Node current = head; current != null; current = current.next) {
            System.out.println(current.data);
        }
        System.out.println("done");
        System.out.flush();
    }
}
