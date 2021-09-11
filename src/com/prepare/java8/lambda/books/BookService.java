package com.prepare.java8.lambda.books;


// suppose we are getting list of book object and based on book name we have sort it and return

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookService {

    // 1. First approach using Comparator - Traditional approach
    public List<Book> getSortedBooks() {
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, new BookComparator());
        return books;
    }

    // 1. First approach using Comparator - Lambda
    public List<Book> getSortedBooksLambda() {
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, (o1,o2) -> o1.getName().compareTo(o2.getName()));
            return books;
        }

        public static void main (String[]args){
            System.out.println("Books Sorted by Name : Traditional Approach" + new BookService().getSortedBooks());
            System.out.println("Books Sorted by Name : Lambda Approach" + new BookService().getSortedBooksLambda());
        }
    }

    class BookComparator implements Comparator<Book> {

        //based on book name
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
