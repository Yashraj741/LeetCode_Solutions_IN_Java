// class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    // public static ListNode insertAtHead(ListNode head, int val) {
    // ListNode newNode = new ListNode(val);
    // newNode.next = head;
    // return newNode; // new head
    // }

    // public static void printList(ListNode head) {
    // ListNode current = head;
    // while (current != null) {
    // System.out.print(current.val + " -> ");
    // current = current.next;
    // }
    // System.out.println("null");
    // }

    // public static void main(String[] args) {
    // ListNode head = null;
    // head = insertAtHead(head, 10);
    // head = insertAtHead(head, 11);
    // head = insertAtHead(head, 12);
    // System.out.println("Before:");
    // printList(head);

    // head = new Solution().removeNthFromEnd(head, 2);
    // System.out.println("After");
    // printList(head);
    // }
}