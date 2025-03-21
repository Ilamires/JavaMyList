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

    public T GetByIndex(int index) {
        Node<T> current = head;
        for (int i = 0; i < index && current != null; ++i)
            current = current.next;
        if (current == null)
            throw new IndexOutOfBoundsException("Index out of bounds");
        return current.value;
    }

    public int GetIndexByValue(T value) {
        Node<T> current = head;
        int result;
        for (result = 0; current != null && current.value != value; ++result)
            current = current.next;
        return current == null ? -1 : result;
    }
}
