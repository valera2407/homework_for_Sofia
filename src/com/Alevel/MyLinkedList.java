package com.Alevel;

import java.util.LinkedList;

public class MyLinkedList <T> extends LinkedList <T> {

    @Override
    public T removeLast() {
        System.out.println("You deleted it value " + getLast() + "but we save it value." +
                "If you want to use it enter 'save'");
        T save = getLast();
        return super.removeLast();
    }

    @Override
    public void addLast(T t) {
        super.addLast(t);
        System.out.println("OK, you add new value in your list." +
                "If you want use it value you need enter index : "+ indexOf(getLast()));
    }


    @Override
    public int size() {
        System.out.println("Your list have " + size() + "positions.");
        return super.size();
    }
}
