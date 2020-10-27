package com.queueoperations;

public class MyQueue {

    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(INode myNode) {
        this.myLinkedList.append(myNode);
    }

    public INode peek() {
        return myLinkedList.head;
    }
}
