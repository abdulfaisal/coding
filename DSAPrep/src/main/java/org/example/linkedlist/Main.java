package org.example.linkedlist;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = ListNode.arrayToLinkedList(new int[]{0, 1, 2, 3, 4, 5, 6});


        ListNode.printLinkedList(listNode);

        Reorder reorder = new Reorder();
        reorder.reorderList(listNode);


        listNode = ListNode.arrayToLinkedList(new int[]{2,4,6,8});

        ListNode.printLinkedList(listNode);
        reorder.reorderList(listNode);

    }
}
