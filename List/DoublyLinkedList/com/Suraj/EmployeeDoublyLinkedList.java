package DoublyLinkedList.com.Suraj;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        // if head -> null then, node is the only Node in the list otherwise node's
        // nextField point to current head node
        node.setNext(head);
        // node.setPrevious(null); //not needed
        if (head == null) {
            tail = node;
        } else {
            // current head previous field point to node
            head.setPrevious(node);
        }

        head = node; // node become head node
        size++;
    }

    public void addToBack(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
            // node.setNext(null); //no need
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;

        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);

        // System.out.println(head.getPrevious());
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
