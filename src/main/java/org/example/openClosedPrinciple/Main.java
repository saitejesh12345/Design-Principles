package org.example.openClosedPrinciple;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(14);
        System.out.println(circle1.calculateArea());

        Rectangle rectangle = new Rectangle(12,21);
        System.out.println(rectangle.calculateArea());
    }
}
