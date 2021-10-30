package com.prepare.java8.challanges;

import java.util.HashSet;


//Problem statement You have to take some chocolates from N different rooms.
// Each room contains Pi number of chocolates of the same or different brands.
// You are given an integer K.
// Write a program to determine whether you can visit each room and find K different brands of chocolates.
//
//Input format
// •First line: T (number of test cases)
// • First line in each test case: Two space-separated integers N and K
// • Next N lines in each test case: Integer P followed by P space-separated strings (denoting the brands of the chocolates)
//For Input  =   k=3
public class TheChocolateRooms {
    public static void main(String[] args) {

        int n = 3, k = 2;

        int[] arr = {1, 2, 1};

        String[][] s = {{"KITKAT"}, {"FIVESTAR", "KITKAT"},
                {"KITKAT"}};

        System.out.println(chocolateRooms(arr, s, n, k));

    }

    static String chocolateRooms(int[] arr, String[][] s,
                                 int n, int k) {
        HashSet<String> st = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            int p = arr[i];

            for (int j = 0; j < p; j++) {

                st.add(s[i][j]);
            }
        }
        if (st.size() >= k)
            return "Yes";
        else
            return "No";
    }
}

