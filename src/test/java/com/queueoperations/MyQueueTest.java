package com.queueoperations;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

    @Test
    public void given3Numbers_WhenAddedToQueue_ShouldReturnFirstAddedNode() {
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);   //add elements to queue using linked list append method
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode peek = myQueue.peek();    //call to check the topmost element in queue
        Assert.assertEquals(myFirstNode , peek);
    }
}
