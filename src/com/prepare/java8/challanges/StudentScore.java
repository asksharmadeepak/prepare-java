package com.prepare.java8.challanges;

//[[1,100], [2,80], [1, 90], [2,60], [1,65]]
// Given this multi dimentian array find the average score of all the student with top 5 socre

import java.util.*;
import java.util.stream.Stream;

public class StudentScore {

    public static void main(String[] args) {

        int[][] items ={{1,100}, {2,80}, {1, 90}, {2,60}, {1,65}};
        ArrayList<Item> itemArrayList = new ArrayList<>();
        Arrays.stream(items).forEach(item -> {
           Item newItem =  new Item(item[0], item[1]);
           itemArrayList.add(newItem);
        });
        Map<Integer, List<Integer>> studentScoreMap = new HashMap<>();
        List<Integer> scoreList = null ;
        Stream<Item> sorted = itemArrayList.stream().sorted(Comparator.comparing(Item::getScore));
//        sorted.forEach(item -> {
//            if(studentScoreMap.containsKey(item.getId())){
//                scoreList.add(item.getScore());
//                studentScoreMap.put(item.getId(), scoreList);
//            }else{
//                scoreList = new ArrayList<>();
//                scoreList.add(item.getScore());
//                studentScoreMap.put(item.getId(), scoreList);
//
//            }
//        });


    }
}

class Item{

    private int id;
    private int score;

    public Item(int id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                score == item.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, score);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
