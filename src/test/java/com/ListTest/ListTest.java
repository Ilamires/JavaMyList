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
}
