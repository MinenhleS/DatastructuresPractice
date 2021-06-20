package org.example;

public class MyQueue {

    private int[] data;
    private int front;
    private int rear;
    private int count;

    public MyQueue(){
        data = new int [6];
        front = 0;
        rear = 0;
        count = 0;
    }

    public boolean isEmpty(){
        if(count == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if ((rear == front) && count > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void enqueue(int value){
        data[rear] = value;
        rear = (rear + 1) % 6;
        count = count + 1;
    }

    public int dequeue(){
        int value = data[front];
        front = (front + 1 ) % 6;
        count = count - 1;
        return value;
    }






}
