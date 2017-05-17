package Char1.data;

import java.util.Iterator;

/**
 * Created by finch on 2017/3/19.
 */
public class Bag<T> implements Iterable<T>{
    private Node first;

    private class Node{
        T item;
        Node next;
    }

    public void add(T item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }


    private class ListIterator implements Iterator<T>{
        private Node current = first;

        @Override
        public void remove() {

        }


        @Override
        public boolean hasNext() {
            return current !=null;
        }

        @Override
        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }
    }
}
