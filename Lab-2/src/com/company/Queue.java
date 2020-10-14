package com.company;

import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> arr; // without maxSize
    public int maxSize;
    public int currentQueueSize;

    // construct queue with maxSize
    public Queue(int m) {
        arr = new ArrayList<>();
        maxSize = m;
        currentQueueSize = 0;
    }

    // default constructor
    public Queue() {
        arr = new ArrayList<>();
        currentQueueSize = 0;
        maxSize = 0;
    }

    // add element to queue
    public void push(int n) {
        if (this.maxSize > this.currentQueueSize || this.maxSize == 0) {
            arr.add(n);
            currentQueueSize += 1;
        } else {
            System.out.println("The queue is full!\n");
        }
    }

    // remove from queue
    public void pop() {
        if (this.currentQueueSize == 0) {
            System.out.println("Underflow!");
        } else {
            arr.remove(0);
            currentQueueSize -= 1 ;
        }
    }

    // check if is empty
    public void isEmpty() {
        if (currentQueueSize == 0){
            System.out.println("The queue is empty!\n");
        }
    }

    // check if is full
    public void isFull() {
        if (maxSize == 0) {
            System.out.println("The queue can never be full!\n");
        } else if ( currentQueueSize == maxSize ) {
            System.out.println("The queue is full!\n");
        } else {
            System.out.println("Free space available: " + (maxSize - currentQueueSize) + "\n");
        }
    }

    public ArrayList<Integer> showQueue() {
        return arr;
    }
}
