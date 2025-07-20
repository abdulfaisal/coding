package org.example.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueImpl {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    void insert(int val) {
        pq.offer(val);
    }

    int extractMax() {
        return pq.poll();
    }

    void insertFor(int arr[]) {
        for(int item:arr) {
            insert(item);
        }
    }
}
