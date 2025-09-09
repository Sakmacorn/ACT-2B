/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reviewer;
import java.util.HashSet;
/**
 *
 * @author Stephanie Castro
 */
public class HasHSeT {   
//A HashSet is a collection where every element is unique - no duplicates are allowed.
    
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");  // Duplicate
    cars.add("Mazda");
    System.out.println(cars);
	}
}
