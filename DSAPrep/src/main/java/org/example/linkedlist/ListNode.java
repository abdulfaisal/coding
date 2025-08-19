package org.example.linkedlist;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode arrayToLinkedList(int[] arr) {
     if (arr == null || arr.length == 0) return null;

     ListNode head = new ListNode(arr[0]);
     ListNode current = head;

     for (int i = 1; i < arr.length; i++) {
      current.next = new ListNode(arr[i]);
      current = current.next;
     }

     return head;
    }

    // Optional: Method to print the linked list
    public static void printLinkedList(ListNode head) {
     ListNode current = head;
     while (current != null) {
      System.out.print(current.val);
      if (current.next != null) System.out.print(" -> ");
      current = current.next;
     }
     System.out.println();
    }
}
