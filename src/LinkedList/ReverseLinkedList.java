package LinkedList;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class ReverseLinkedList {
	public static void main(String[] args) {
		// Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		System.out.println("Original linked list:");
		printLinkedList(head);

		// Reverse the linked list
		head = reverseLinkedList(head);

		System.out.println("Reversed linked list:");
		printLinkedList(head);
	}

	private static ListNode reverseLinkedList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		ListNode next;

		while (current != null) {
			next = current.next; // Save the next node
			current.next = prev; // Reverse the link
			prev = current; // Move to the next nodes
			current = next;
		}

		return prev; // The new head of the reversed linked list
	}

	private static void printLinkedList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}
}
