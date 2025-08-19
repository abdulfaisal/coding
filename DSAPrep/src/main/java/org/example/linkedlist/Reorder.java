package org.example.linkedlist;

import java.util.Stack;

public class Reorder {

    //[0, n-1, 1, n-2, 2, n-3, ...]

    public void reorderList(ListNode head) {
        ListNode root = head;
        Stack<ListNode> mystack = new Stack<>();
        int l = 0;
        while(root!=null) {
            mystack.push(root);
            root = root.next;
            l++;
        }

//        ListNode.printLinkedList(head);

        int m = l/2;

        while(head!=null && m > 0) {
            System.out.print(head.val);
//            System.out.print(" -> ");
            System.out.print(mystack.pop().val);
//            System.out.print(" -> ");
            m--;
            head = head.next;
        }

        if(l%2 != 0) System.out.print(head.val);

//        System.out.println();
    }

}
