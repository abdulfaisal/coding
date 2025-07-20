package org.example.Heap;

public class Heap {
    int[] heap = new int[20];
    int capacity = 20;
    int size = 0;

    int parent(int i)  { return (i-1)/2;}
    int left(int i) {return 2*i + 1;}
    int right(int i) { return 2*i + 2;}

    void insert(int val) {
        int current= 0;
        if(size < capacity) {
            heap[size] = val;
            current = size;
            size++;
        }

        while(current >0 && heap[current] > heap[parent(current)]){
            swap(current,parent(current));
            current = parent(current);
        }
    }

    int extractMax() {
        int max = heap[0];
        heap[0] = heap[--size];
        heapify(0);
        return max;
    }

    void swap(int i, int j) {
        int temp = heap[j];
        heap[j] = heap[i];
        heap[i] = temp;
    }

    void heapify(int root) {
        int largest = root;
        int l = left(root);
        int r = right(root);

        if(l<size && heap[largest] < heap[l]) largest = l;
        if(r<size && heap[largest] < heap[r]) largest = r;
        if(root !=largest) {
            swap(root, largest);
            heapify(largest);
        }
    }

    void insertFor(int[] arr) {
        for(int item: arr) insert(item);
    }
}
