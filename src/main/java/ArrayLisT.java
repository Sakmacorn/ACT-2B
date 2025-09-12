/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
/**
 *
 * @author Stephanie Castro
 */
public class ArrayLisT {
//    An ArrayList is a resizable array that can grow as needed.
//    It allows you to store elements and access them by index.
    
    public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
//                Normal Array
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            cars.add("rusi");
            System.out.println(cars);
            
//              Add Array. (Ilalagay nya yung naka string na nasa loob ng Line 32 dun sa cars.
//              Kaya yung magiging number 1 sa list nyan is Jeepney since starting number sa coding is 0.)
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            cars.add("rusi");
            
            cars.add(0, "Jeepney");
            System.out.println(cars);
            
//            Get Array. (Dito naman ay kukunin nya lang yung gusto mong kunin sa cars,
//            Since 2 yung nakalagay bali yugn result is Ford)
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            cars.add("rusi");
            System.out.println(cars.get(2));
            
//            Set Array. Etong set is papalitan nya yung nasa loob ng mga options.
//            For example, (0,"Jeepney") bali yung mazda mapapalitan sya ng jeepney kase set yung nakalagay
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            cars.add("rusi");
            cars.set(2, "Jeepney");
            System.out.println(cars);
            
//            Remove Array. Kung anong number yung nilagay mo sa cars.remove(0) maaalis yung number 1 sa cars(Volvo)
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            cars.add("rusi");
            cars.remove(0);
            System.out.println(cars);
	}
}
