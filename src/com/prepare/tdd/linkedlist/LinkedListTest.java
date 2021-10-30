package com.prepare.tdd.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {


//    @Test
//    public void shouldHaveZeroSizeForEmptyList(){
//        LinkedList list = new LinkedList();
//        Assert.assertEquals(0, list.size());
//    }

    @Test
    public void testSize_initialList(){
        LinkedList list = new LinkedList();
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSize_oneElement_sizeIsOne(){
        LinkedList list = new LinkedList();
        list.add("a");
        Assert.assertEquals(1, list.size());
    }


}
