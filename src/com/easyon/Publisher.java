package com.easyon;

import java.util.ArrayList;

public class Publisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    private int attribute;

    public void changeAttribute(int newValue){
        System.out.println("Publisher: Change method is called and the attribute is changed to: " + newValue);
        attribute = newValue;
        notifySubscriber(newValue);
    }

    public void notifySubscriber(int val){
        for(Subscriber s : subscribers){
            s.update(val);
        }
    }

    public void addSubscriber(Subscriber s){
        subscribers.add(s);
    }

}
