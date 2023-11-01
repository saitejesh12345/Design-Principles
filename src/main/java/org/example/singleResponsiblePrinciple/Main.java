package org.example.singleResponsiblePrinciple;

public class Main {
    public static void main(String[] args) {



        DesigningConsole design1 = new DesigningConsole();
        design1.Welcomeprint();

        Customers customer1 = new Customers();
//        customer1.Welcomeprint();
        customer1.setName("John");
        customer1.setAddress("Delhi");
        customer1.setPhoneNum("79818828213");

        Order order1 = new Order();
        order1.setItemName("Pizza");
        order1.setQuantity(2);
        order1.setCustomers(customer1);
        System.out.println();
        order1.prepareOrder();

        System.out.println();
        design1.DeliveryMsgprint();
        System.out.println();

        BillCalculation billCalculation
                = new BillCalculation(order1);
        billCalculation.calculateBill();



        DeliveryApp deliveryApp = new DeliveryApp(order1);
        deliveryApp.Delivery();
        System.out.println();

        design1.DeliverdMsgprint();

    }
}
