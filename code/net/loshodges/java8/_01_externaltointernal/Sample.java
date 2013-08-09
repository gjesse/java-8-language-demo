package net.loshodges.java8._01_externaltointernal;

import java.util.*;
import java.util.function.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

/*    // self inflicted wound pattern
    for(int i = 0; i < numbers.size(); i++) {
      System.out.println(i);

    }*/
    /*
    // better, but still flawed - external iterator
    for(int e : numbers) {
      System.out.println(e);
    }
    */

    // now with consumer: internal iterator
    // consumer does produce side effects
    /*
    numbers.forEach(new Consumer<Integer>() {
      public void accept(Integer number) {
        System.out.println(number);
      }
    });
    */
    /*
    // how low can we go?
    numbers.forEach((Integer number) -> System.out.println(number));
    */

/*
    // Leave off the type declaration??? is this java?
    numbers.forEach(number -> System.out.println(number));
*/

/*
    // omgwtfbbq
    numbers.forEach(System.out::println);
*/
  }
}
