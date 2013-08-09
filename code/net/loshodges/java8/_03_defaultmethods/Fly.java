package net.loshodges.java8._03_defaultmethods;

public interface Fly {
  default void takeOff() { System.out.println("net.loshodges.java8._03_defaultmethods.Fly::takeOff"); }
  default void land() { System.out.println("net.loshodges.java8._03_defaultmethods.Fly::land"); }
  default void turn() { System.out.println("net.loshodges.java8._03_defaultmethods.Fly::turn"); }
  default void cruise() { System.out.println("net.loshodges.java8._03_defaultmethods.Fly::cruise"); }
}
