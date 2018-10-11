package com.gavin.iterator;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        MyList<User> list = new MyList();
        list.add(new User(1, "a"));
        list.add(new User(2, "a"));
        list.add(new User(3, "a"));
        list.add(new User(4, "a"));
        list.add(new User(5, "a"));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
