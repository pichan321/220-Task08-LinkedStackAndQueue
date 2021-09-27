package edu.ithaca.dragon.datastructures.queue;

import java.util.NoSuchElementException;

import edu.ithaca.dragon.datastructures.node.LinkedNode;

public class LinkedQueue<T> implements Queue<T>{

    private LinkedNode<T> front;
    private LinkedNode<T> end;

    public LinkedQueue(){
        front = null;
        end = null;
    }

    @Override
    public void enqueue(T item) {
        LinkedNode<T> newNode = new LinkedNode<T>(item);
        if (front == null){
            front = newNode;
            end = newNode;
        }
        else {
            end.setNext(newNode);
            end = newNode;
        }
    }

    @Override
    public T dequeue() {
        // TODO 
        T temp;
        if (isEmpty()) {
            throw new NoSuchElementException("Can't dequeue an empty queue.");
        } else {
            temp = front.getItem();
            front = front.getNext();
            return temp;
        }
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public void makeEmpty() {
        // TODO
        front = null;
    }
    
    public static void main(String[] args) {
    }
}
