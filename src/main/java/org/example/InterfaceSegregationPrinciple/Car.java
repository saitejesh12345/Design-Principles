package org.example.InterfaceSegregationPrinciple;

//public class Car implements Vehicle{

public class Car implements Vehicle,Movable {
    @Override
    public void setPrice(double price) {

    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }


    //car cannot fly so we cannot write logic for this if we leave like this means its breaking the
    //Interface Segregation Principle so to resolve this issue,instead of having one
    // interface we will be having multiple interface and we comment this and implement using (",")
    //public class Car implements Vehicle,Movable{}
//    @Override
//    public void fly() {
//
//    }
}
