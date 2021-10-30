package com.prepare.java8.challanges;

import java.util.*;

public class SchoolSectionHighestMaleAndFemale {


    public static void main(String[] args) {

        List<Section> sectionFromApi = Arrays.asList(new Section("Section A", 10, 20),
                new Section("Section B", 20, 10),
                new Section("Section C", 30, 5));

        Optional<Section> out = sectionFromApi.stream().max(Comparator.comparing(Section::getNumberOfMale));

        System.out.println(out.get());

        int sumOfAllMaleStudent = sectionFromApi.stream().mapToInt(section -> section.getNumberOfMale()).sum();
        int sumOfAllFemaleStudent = sectionFromApi.stream().mapToInt(section -> section.getNumberOfFemale()).sum();

        System.out.println(sumOfAllMaleStudent + sumOfAllFemaleStudent);

    }

}




class Section{

    private String name;
    private int  numberOfMale;
    private int  numberOfFemale;

    @Override
    public String toString() {
        return "Section{" +
                "name='" + name + '\'' +
                ", numberOfMale=" + numberOfMale +
                ", numberOfFemale=" + numberOfFemale +
                '}';
    }

    public Section(String name, int numberOfMale, int numberOfFemale) {
        this.name = name;
        this.numberOfMale = numberOfMale;
        this.numberOfFemale = numberOfFemale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMale() {
        return numberOfMale;
    }

    public void setNumberOfMale(int numberOfMale) {
        this.numberOfMale = numberOfMale;
    }

    public int getNumberOfFemale() {
        return numberOfFemale;
    }

    public void setNumberOfFemale(int numberOfFemale) {
        this.numberOfFemale = numberOfFemale;
    }
}


