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
    int size;

    public MyList() {
        head = null;
        size = 0;
    }

    public int Size() {
        return size;
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
        ++size;
    }

    public T GetByIndex(int index) {
        Node<T> current = head;
        if (index < size)
            for (int i = 0; i < index && current != null; ++i)
                current = current.next;
        if (current == null || index >= size)
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

    public boolean RemoveByIndex(int index) {
        boolean isRemoved = false;
        Node<T> current = head;
        if (current != null && index < size) {
            for (int i = 0; current.next != null && i < index - 1; ++i)
                current = current.next;
            if (current.next != null) {
                current.next = current.next.next;
                isRemoved = true;
                --size;
            }
        }
        return isRemoved;
    }

    public boolean RemoveByValue(T value) {
        boolean isRemoved = false;
        Node<T> current = head;
        if (current != null) {
            for (int i = 0; current.next != null && current.next.value != value; ++i)
                current = current.next;
            if (current.next != null) {
                current.next = current.next.next;
                isRemoved = true;
                --size;
            }
        }
        return isRemoved;
    }
}
