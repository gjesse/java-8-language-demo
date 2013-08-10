package net.loshodges.java8._03_defaultmethods;

public class SeaPlane extends Vehicle implements FastFly, Sail {
 public void cruise() {
     System.out.println("net.loshodges.java8._03_defaultmethods.SeaPlane::cruise");
    // FastFly.super.cruise();
    // Sail.super.cruise();
 }
}