package com.ListTest;

import com.MyList.MyList;
import org.junit.Test;
import org.junit.Assert;

public class ListTest {


    @Test
    public void MyListPushBackAndGetByIndexTest() {
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

    @Test
    public void MyListRemoveByIndexTest() {
        MyList<Integer> myList = new MyList<Integer>();
        myList.PushBack(43);
        myList.PushBack(43);
        myList.PushBack(4673);
        myList.PushBack(4884);
        myList.RemoveByIndex(2);
        myList.RemoveByIndex(1);
        Assert.assertTrue(myList.GetIndexByValue(43) == 0 &&
                myList.GetIndexByValue(4673) == -1 &&
                myList.GetIndexByValue(4884) == 1);
    }

    @Test
    public void MyListSizeTest() {
        boolean result = true;
        MyList<Integer> myList = new MyList<Integer>();
        myList.PushBack(43);
        myList.PushBack(43);
        myList.PushBack(4673);
        myList.PushBack(4884);
        result = myList.Size() == 4;

        myList.RemoveByIndex(2);
        myList.RemoveByValue(43);
        myList.RemoveByIndex(1);
        result = result && myList.Size() == 1;

        myList.RemoveByValue(43);
        result = result && myList.Size() == 0;

        Assert.assertTrue(result);
    }

    @Test
    public void MyListClearTest() {
        MyList<Integer> myList = new MyList<Integer>();
        myList.PushBack(43);
        myList.PushBack(43);
        myList.PushBack(4673);
        myList.PushBack(4884);

        myList.RemoveByIndex(2);
        myList.PushBack(483);
        myList.PushBack(46738);
        myList.Clear();

        Assert.assertEquals(0, myList.Size());
    }
}
