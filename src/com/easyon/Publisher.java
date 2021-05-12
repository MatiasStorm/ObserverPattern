package com.easyon;

import java.util.ArrayList;

public class Publisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    //This attribute is the information being passed to the subscribers, could be anything.
    private int attribute;

    //Can be used to change the attribute
    public void changeAttribute(int newValue){
        System.out.println("Publisher: Change method is called and the attribute is changed to: " + newValue);
        attribute = newValue;
        //Uses the another method from publisher
        notifySubscriber(newValue);
    }
        //loops through all subscribers in the ArrayList Subscriber and calls the update function on each
    public void notifySubscriber(int val){
        for(Subscriber s : subscribers){
            //The val here is replaced with the "newValue" from the change attribute method
            s.update(val);
        }
    }

    public void addSubscriber(Subscriber s){
        subscribers.add(s);
    }

}
