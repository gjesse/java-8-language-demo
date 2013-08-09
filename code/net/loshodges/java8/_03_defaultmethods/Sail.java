package net.loshodges.java8._03_defaultmethods;

public interface Sail {
  default void cruise() { System.out.println("net.loshodges.java8._03_defaultmethods.Sail::Cruise"); }
  default void turn() { System.out.println("net.loshodges.java8._03_defaultmethods.Sail::turn"); }
}