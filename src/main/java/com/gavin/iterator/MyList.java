package com.gavin.iterator;

import java.util.Iterator;

public class MyList<T> {
    private Object[] objects = null;
    private int size = 0;
    private int index = 0;

    public MyList() {
        objects = new Object[4];
    }

    public void add(T obj) {
        if (index == objects.length) {
            Object[] newArray = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newArray, 0, objects.length);
            objects = newArray;
        }
        objects[index] = obj;
        index ++;
        size ++;
    }

    public <T> Object get(int i) {
        return objects[i];
    }


    public int size() {
        return size;
    }

    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public T next() {
            Object obj = MyList.this.get(cursor);
            cursor++;
            return (T)obj;
        }

        @Override
        public void remove() {

        }
    }


}
