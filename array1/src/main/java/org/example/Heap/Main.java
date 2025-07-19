package org.example.Heap;

import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Heap heapObj = new Heap();
        heapObj.insertFor(new int[]{1,4,5,10,2,8});

        System.out.println("Array::");
        //kth largest
        int i=0;
        while(i<4) {
            System.out.println(heapObj.extractMax());
            i++;
        }


        System.out.println("PriorityQ::");

        PriorityQueImpl priorityQue = new PriorityQueImpl();
        priorityQue.insertFor(new int[]{1,4,5,10,2,8});
        i=0;
        while(i<4) {
            System.out.println(priorityQue.extractMax());
            i++;
        }
    }

}
