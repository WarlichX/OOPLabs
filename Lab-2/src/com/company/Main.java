package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1\n");

        BoxShape object1 = new BoxShape();
        System.out.println("Object 1 with default params:");
        object1.getInfo();

        BoxShape object2 = new BoxShape(10);
        System.out.println("Object 2 with 1 param:");
        object2.getInfo();

        BoxShape object3 = new BoxShape(1, 2, 3);
        System.out.println("Object 3 with params:");
        object3.getInfo();

        System.out.println("Task 2: ");
        Queue queue1 = new Queue(3);
        Queue queue2 = new Queue();
        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        queue1.pop();
        System.out.println("Queue1: "+ queue1.showQueue());

        queue2.push(4);
        queue2.push(5);
        queue2.push(6);
        queue2.pop();
        System.out.println("Queue2: "+ queue2.showQueue() + "\n");

        System.out.println("Task 3: ");
        System.out.println("Object1 volume is: " + object1.Volume());
        System.out.println("Object2 volume is: " + object2.Volume());
        System.out.println("Object3 volume is: " + object3.Volume() + "\n");

        System.out.println("Object1 surface area is: " + object1.Area());
        System.out.println("Object2 surface area is: " + object2.Area());
        System.out.println("Object3 surface area is: " + object3.Area() + "\n");

        Queue queue3 = new Queue();
        System.out.println("Empty queue (unlimited maxSize):");
        queue3.isEmpty();

        queue3.push(0);
        queue3.push(1);
        queue3.push(2);
        queue3.push(3);
        System.out.println("Queue with no maxSize: ");
        queue3.isFull();

        Queue queue4 = new Queue(2);
        queue4.push(1);
        queue4.push(2);
        System.out.println("Full queue (with maxSize): ");
        queue4.isFull();

        Queue queue5 = new Queue(4);
        queue5.push(1);
        queue5.push(2);
        queue5.push(3);
        System.out.println("Queue with maxSize of 4: ");
        queue5.isFull();
    }
}
