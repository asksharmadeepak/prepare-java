package com.prepare.tdd.linkedlist;
//Specific Link for String type we can genralize it by using T as type

public class LinkedList {

    private int size = 0;
    private Node node;

    public int size() {
        return size;
    }

    public void add(String input) {
        size++;
        node = new Node(input);
    }
}

class Node {
    private String value;

    public Node(String value) {
        this.value = value;
    }
}