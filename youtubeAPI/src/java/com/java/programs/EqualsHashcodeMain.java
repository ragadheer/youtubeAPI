/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.programs;

/**
 *
 * @author raghavendhar.r
 */

class User{
    public int id;
    public String name;
    
    User(int id,String name){
        this.id=id;
        this.name=name;
    }
    
    @Override
    public boolean equals(Object o){
        if(o==this)
            return true;
        if(!(o instanceof User))
            return false;
        
        User u =(User)o;
                
        return u.id==id && u.name.equals(name);
    }
    
    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result+id;
        result = 31*result+name.hashCode();
        return result;
    }
}

public class EqualsHashcodeMain {
    
    public static void main(String args[]){
        User u = new User(1,"A");
        User u1 = new User(1,"A");
        System.out.println(u.hashCode()+".."+u1.hashCode());
        System.out.println(u.equals(u1));
    }
}
