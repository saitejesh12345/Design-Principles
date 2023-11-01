package org.example.singleResponsiblePrinciple;

import java.util.Random;

public class BillCalculation {

    private Order order;
    private int takeAway = 20;

    public BillCalculation(Order order) {
        this.order = order;
    }

    public void calculateBill(){
        Random rand = new Random();
        int totalAmt
                = rand.nextInt(200) * this.order.getQuantity();

        this.order.setTotalBillAmt(totalAmt);
        System.out.println("Order with order id  "
                + this.order.getOrderId()
                + " has a total bill amount of "
                + this.order.getTotalBillAmt());
    }


    //    private Order quantity;
//    private Order orderId;
//
//
//    public BillCalculation(Order order, int takeAway) {
//        this.order = order;
//        this.takeAway = takeAway;
//
//
//    }
//
//    public BillCalculation() {
//    }
//
//    public BillCalculation(Order order1) {
//
//    }
//
//
//    public void calculateBill(){
//        Random rand = new Random();
//
//        // Assuming the Order class has a constructor that takes the quantity as a parameter
//        Order order = new Order(quantity);
//
//        int totalAmt =  rand.nextInt(200) * order.getQuantity() + takeAway;
//
//        order.setTotalBillAmt(totalAmt);
//
//
//        // Assuming the Order class has a constructor that takes the orderId as a parameter
//         Order order2 = new Order(orderId);
//
//        order2.setOrderId(order.getOrderId()); // Set the orderId value
//
//        // Assign the value of order2 to order
//        this.order = order2;
//
//        System.out.println("Order with order id  "
//                + order.getOrderId()
//                + " has a total bill amount of "
//                + this.order.getTotalBillAmt());
//    }
}
