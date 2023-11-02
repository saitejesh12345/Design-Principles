package org.example.liskovSubstitutionPrinciple.childclass;

import org.example.liskovSubstitutionPrinciple.superclass.FlyingBirds;

public class Duck extends FlyingBirds {

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void fly() {
        super.fly();
    }
}
