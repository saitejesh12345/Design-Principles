package org.example.liskovSubstitutionPrinciple.childclass;

import org.example.liskovSubstitutionPrinciple.superclass.Birds;

public class Ostritch extends Birds {

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    //ostrictch cannot fly,so we wont be using this method even though we override this will break
    //Liskov substitution principle.to solve this problem create another super class
    //for all the flying birds.so here we are maintaing two super class and utilizing them.

//    @Override
//    public void fly() {
//        super.fly();
//    }
}
