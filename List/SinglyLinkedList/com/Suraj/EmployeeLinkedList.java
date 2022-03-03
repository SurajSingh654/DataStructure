package SinglyLinkedList.com.Suraj;

public class EmployeeLinkedList {

    public EmployeeNode head;
    public int size;

    public void addToFront(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);

        // if (isEmpty()) {
        // head = newNode;
        // return;
        // }

        newNode.setNext(head); // newNode points to headNode
        head = newNode; // newNode become headNode
        size++;
    }

    public void addToLast(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);

        // if (isEmpty()) {
        // head = newNode;
        // return;
        // }
        EmployeeNode currentNode = head;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode); // lastNode points to newNode added at last
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext(); // headNode pointing to next node from the headNode
        size--;
        removedNode.setNext(null); // break connection between headNode and newHeadNode
        return removedNode;
    }

    public EmployeeNode removeFromLast() {
        if (isEmpty()) { // If List is Empty...
            return null;
        }
        size--;
        if (head.getNext() == null) { // If only one node is present...
            EmployeeNode removedNode = head;
            head = null;
            return removedNode;
        }

        EmployeeNode currentNode = head;
        EmployeeNode nextToCurrentNode = head.getNext();

        while (nextToCurrentNode.getNext() != null) {
            nextToCurrentNode = nextToCurrentNode.getNext();
            currentNode = currentNode.getNext();
        }
        EmployeeNode removedNode = nextToCurrentNode;
        currentNode.setNext(null); // secondLast node now points to null
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
        if (current == null) {
            System.out.println("List is Empty");
            return;
        }
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

}
