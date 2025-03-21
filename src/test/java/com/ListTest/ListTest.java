package com.ListTest;

import com.MyList.MyList;
import org.junit.Test;
import org.junit.Assert;

public class ListTest {

    @Test
    public void MyListPushBackTest() {
        MyList<Integer> myList = new MyList<Integer>();
        myList.PushBack(1);
        myList.PushBack(43);
        myList.PushBack(4673);
        Assert.assertTrue(myList.GetByIndex(0) == 1 &&
                myList.GetByIndex(1) == 43 &&
                myList.GetByIndex(2) == 4673);
    }

    @Test
    public void MyListGetIndexByValueTest() {
        MyList<Integer> myList = new MyList<Integer>();
        myList.PushBack(1);
        myList.PushBack(43);
        myList.PushBack(4673);
        Assert.assertTrue(myList.GetIndexByValue(80) == -1 &&
                myList.GetIndexByValue(1) == 0 &&
                myList.GetIndexByValue(43) == 1 &&
                myList.GetIndexByValue(4673) == 2);
    }

    @Test
    public void MyListRemoveByValueTest() {
        MyList<Integer> myList = new MyList<Integer>();
        myList.PushBack(43);
        myList.PushBack(43);
        myList.PushBack(4673);
        myList.PushBack(4884);
        myList.RemoveByValue(4673);
        myList.RemoveByValue(43);
        Assert.assertTrue(myList.GetIndexByValue(43) == 0 &&
                myList.GetIndexByValue(4673) == -1 &&
                myList.GetIndexByValue(4884) == 1);
    }

}
