package Char1.data;

/**
 * Created by finch on 2016/11/6.
 */
public class Queue<T> {
    private Node first;
    private Node last;

    private int N;

    private class Node {
        T data;
        Node next;
    }

    public int size() {
        return N > 0 ? N : 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(T data) {
        Node oldLast = last;
        last = new Node();
        last.data = data;
        last.next = null;
        // 如果 队列是空的 则需要将first 和last指向同一个点
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    public T dequeue() {
        T data = first.data;
        // 删除节点
        first = first.next;
        // 如果队列为空 则 首节点和尾节点都需要置null
        if (isEmpty()) {
            last = null;
        }
        N--;
        return data;
    }
}
