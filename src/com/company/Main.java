package com.company;

public class Main {

    public static void main(String[] args) {

        Course[] students = new Course [1];

        students[0] = new Course("ComputerScience", "SingleClasses", "Jarmo", -1);

        for (Course s : students)
            System.out.println(s);
    }
}
