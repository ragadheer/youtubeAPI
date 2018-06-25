/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author raghavendhar.r
 */

class Student1 implements Comparable<Student1>{
    
    public int id;
    public String name;
    public int age;
    
    Student1(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    
    public int compareTo(Student1 s){
        if(s.age==age)
            return 0;
        else if(s.age<age)
            return 1;
        else
            return -1;
    }
}

public class ComparableMain {

    public static void main(String args[]){
        List<Student1> list = new ArrayList();
        Student1 s = new Student1(1,"A",12);
        Student1 s1 = new Student1(2,"B",15);
        Student1 s3 = new Student1(3,"C",27);
        list.add(s);
        list.add(s1);
        list.add(s3);
        Collections.sort(list);
        
        for(Student1 s2:list){
            System.out.println(s2.id+".."+s2.name+".."+s2.age);
        }
        
        
    }
}
