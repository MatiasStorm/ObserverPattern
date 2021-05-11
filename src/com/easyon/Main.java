package com.easyon;

public class Main {
    public static void main(String[] args) {

        //instantiate two new publishers
        Publisher p = new Publisher();

        Publisher p2 = new Publisher();

        //Sub 1
        p.addSubscriber(new Subscriber());
        //Sub 2
        p.addSubscriber(new Subscriber());
        //Sub 3
        p.addSubscriber(new Subscriber());
        //Sub 4
        p2.addSubscriber(new Subscriber());


        //Changes the value of the attribute using the method from publisher.
        System.out.println("Change p1's value");
        p.changeAttribute(2);

        System.out.println("\nChange p2's value");
        p2.changeAttribute(2);
    }
}
