package Java_cert;

import java.util.Set;
import java.util.TreeSet;

public class Question32 {

  public static void main(String[] args) {
    Set<Q32A_Vehicle> vehicles = new TreeSet<>();
    vehicles.add(new Q32A_Vehicle (10123, "Ford"));
    vehicles.add(new Q32A_Vehicle (10124, "BMW"));
    System.out.println(vehicles);
  }

}


//output is :
/*
Exception in thread "main" java.lang.ClassCastException: Java_cert.Q32A_Vehicle cannot be cast to java.lang.Comparable
	at java.util.TreeMap.compare(TreeMap.java:1294)
	at java.util.TreeMap.put(TreeMap.java:538)
	at java.util.TreeSet.add(TreeSet.java:255)
	at Java_cert.Question32.main(Question32.java:10)
 */

//Correct Answer is Option D: A ClassCastException is thrown at run time