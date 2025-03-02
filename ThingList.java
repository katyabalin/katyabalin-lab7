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

    public void addThing(Thing thing) {
        Node newNode = new Node(thing);
        newNode.next = head;
        head = newNode;
    }

    public void moveAll() {
        Node current = head;
        while (current != null) {
            current.data.maybeTurn();
            current.data.step();
            current = current.next;
        }
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("done");
        System.out.flush();
    }
}
