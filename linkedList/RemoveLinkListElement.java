class Node {
    int val;
    Node next;

    Node(int v) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveLinkListElement {
    public static void removeElements(Node head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        Node current = head;

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}