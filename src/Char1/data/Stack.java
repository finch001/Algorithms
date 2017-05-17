package Char1.data;

/**
 * Created by finch on 2016/11/6.
 */
public class Stack<T> {
    private Node first;
    private int N;

    private class Node{
        T item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int getSize(){
        return N > 0 ? N: 0;
    }

    public void push(Node item){
        Node oldFirst = first;
        first = new Node();
        first.item = item.item;
        first.next = oldFirst;
        N++;
    }


    public T pop(){
        //一般我们都会拿到这个删除的数据
        T item = first.item;
        //这里涉及到内存回收知识
        first = first.next;
        N--;
        return item;
    }



}
