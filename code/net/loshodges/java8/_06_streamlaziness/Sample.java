package net.loshodges.java8._06_streamlaziness;

import java.util.*;

public class Sample {
  public static boolean isGreaterThan2(int number) {
    System.out.println("isGreater " + number);
    return number > 2;
  }
  
  public static boolean isEven(int number) {
    System.out.println("isEven " + number);
    return number % 2 == 0;
  }
  
  public static int doubleIt(int number) {
    System.out.println("doubleIt " + number);
    return number * 2;
  }
  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    
    //double the first even number greater than 3 from the list
    Integer firstEvenGtThree =       numbers.stream()
            .filter(Sample::isGreaterThan2)
            .filter(Sample::isEven)
            .mapToInt(Sample::doubleIt)
            .findFirst().getAsInt();
            ;
      System.out.println( firstEvenGtThree );

  }
}

