package edu.ithaca.dragon.datastructures.stack;

import java.util.NoSuchElementException;

import edu.ithaca.dragon.datastructures.node.LinkedNode;

public class LinkedStack<T> implements Stack<T>{

    private LinkedNode<T> top;

    public LinkedStack(){
        top = null;
    }

    @Override
    public void push(T item) {
        LinkedNode<T> newNode = new LinkedNode<T>(item);
        newNode.setNext(top);
        top = newNode;
    }

    @Override
    public T pop() {
        // TODO
        T temp;
        if (isEmpty()) {
            throw new NoSuchElementException("Can't pop an empty stack.");
        } else {
            temp = top.getItem();
            top = top.getNext();
            return temp;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void makeEmpty() {
        // TODO
        top = null;
    }
    
}
