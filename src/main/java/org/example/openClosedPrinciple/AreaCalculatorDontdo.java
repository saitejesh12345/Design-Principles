package org.example.openClosedPrinciple;

public class AreaCalculatorDontdo {



    //1st requirement to add this method completed and tested and running in Production
    public double calculateRectangleArea(double width,double height){
        return width*height;
    }

    //2nd requirement to add new functionality
    //editing in same AreaCalculator class ,like square Area so on modifying this class is
    //not a good way . open for modfication is not best pratice in open-close principle
    //we will  design new functionality by open for extension.Create Interface callled Shape and
    //add method and create seperate classes and use that implementation
    public double calculateCircleArea(double radius){
        return Math.PI * radius *radius;
    }
}
