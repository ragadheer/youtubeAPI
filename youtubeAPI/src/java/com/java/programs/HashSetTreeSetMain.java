/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author raghavendhar.r
 */
public class HashSetTreeSetMain {
    
    public static void main(String args[]){
        
        HashSet hs = new HashSet();
        hs.add("abd");
        hs.add("dbd");
        hs.add("cbd");
        hs.add("bbd");
        
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------");
        
        TreeSet ts = new TreeSet(hs);
        it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    
}
