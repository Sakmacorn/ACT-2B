/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reviewer;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Stephanie Castro
 */
public class iteratorsss {
    // Create an ArrayList of Strings
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get an iterator for the ArrayList
    Iterator<String> it = cars.iterator();

    // Iterate through the list using the iterator
    while(it.hasNext()) {
      System.out.println(it.next());
      
    }
}
