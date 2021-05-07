package com.easyon;

public class Subscriber {
    private static int counter = 1;
    private int id;

    public Subscriber( Publisher p ){
        id = counter++;
        p.addSubscriber(this);
    }
    public void update(int value){
        System.out.printf("Subscriber (%d): got an update with value: %d\n", id, value);
    }
}
