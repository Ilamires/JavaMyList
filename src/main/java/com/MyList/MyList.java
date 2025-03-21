package com.MyList;

public class MyList<T> {
    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        Node(T value) {
            this(value, null);
        }
    }

    Node<T> head;

    public MyList() {
        head = null;
    }

    public void PushBack(T value) {
        if (head == null)
            head = new Node<T>(value);
        else {
            Node<T> current = head;
            while (current.next != null)
                current = current.next;
            current.next = new Node<T>(value);
        }
    }
}
