/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;
import java.util.TreeSet; 
class TreeSetDemo { 
  
    public static void main(String[] args) 
    { 
        // Create a TreeSet 
        TreeSet<String> tset = new TreeSet<String>(); 
  
        // add elements to HashSet 
        tset.add("geeks"); 
        tset.add("for"); 
        tset.add("practice"); 
        tset.add("contribute"); 
  
        // Duplicate removed 
        tset.add("geeks"); 
  
        // Displaying TreeSet elements 
        System.out.println("TreeSet contains: "); 
        for (String temp : tset) { 
            System.out.println(temp); 
        } 
    } 
}
