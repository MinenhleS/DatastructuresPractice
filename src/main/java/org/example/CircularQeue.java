package org.example;

public class CircularQeue {

    public static void main(String[] args) {
        MyQueue aQueue = new MyQueue();
        aQueue.enqueue(1);
        aQueue.enqueue(2);
        aQueue.enqueue(3);
        aQueue.enqueue(4);
        aQueue.enqueue(5);
        aQueue.enqueue(6);

        int n = aQueue.dequeue();
        //System.out.println(n);

        aQueue.enqueue(7);

        while(!aQueue.isEmpty()){
            int value = aQueue.dequeue();
            System.out.println(value);
        }

    }
}
