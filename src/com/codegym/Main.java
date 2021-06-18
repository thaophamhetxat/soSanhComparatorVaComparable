package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Student student1 = new Student("lan",23,"HY");
	Student student2 = new Student("linh",21,"HP");
	Student student3 = new Student("ngoc",24,"HT");


        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student s:lists){
            System.out.println(s.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("so sanh theo tuoi");
        for(Student s:lists){
            System.out.println(s.toString());
        }
    }
}
