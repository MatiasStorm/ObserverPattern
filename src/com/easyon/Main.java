package com.easyon;

public class Main {
    public static void main(String[] args) {
        Publisher p = new Publisher();
        new Subscriber(p);
        new Subscriber(p);
        new Subscriber(p);
        new Subscriber(p);

        Publisher p2 = new Publisher();

        System.out.println("Change p1's value");
        p.changeAttribute(2);

        System.out.println("\nChange p2's value");
        p2.changeAttribute(2);
    }
}
