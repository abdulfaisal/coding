package org.example.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MeadianStrem {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();


    Double medianInsert(int val) {
        if(maxHeap.isEmpty() || maxHeap.peek() > val) maxHeap.offer(val);
        else minHeap.offer(val);

        if(maxHeap.size() > minHeap.size() +1 ) {
            minHeap.offer(maxHeap.poll());
        } else if(maxHeap.size() <  minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }

        if(maxHeap.size() == minHeap.size()) return (double) ((maxHeap.peek()+minHeap.peek()) /2);
        else return (double) maxHeap.peek();
    }

    void forInsert(int[] arr) {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
        for(int item: arr) System.out.println(medianInsert(item));
    }
}
