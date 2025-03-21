package com.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> test = new MyList<Integer>();
        test.PushBack(1);
        test.PushBack(43);
        test.PushBack(48);
        test.PushBack(43);

        System.out.println(test.GetByIndex(1));
        System.out.println(test.GetByIndex(0));
        System.out.println(test.GetByIndex(2));

        System.out.println(test.GetIndexByValue(43));
        System.out.println(test.GetIndexByValue(42));
        System.out.println(test.RemoveByValue(43));
        System.out.println(test.RemoveByIndex(1));

        System.out.println(test.GetByIndex(1));
        System.out.println(test.GetByIndex(0));
    }
}