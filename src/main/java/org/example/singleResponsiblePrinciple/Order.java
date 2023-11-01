package org.example.singleResponsiblePrinciple;

import java.util.Random;

public class Order {

    private Customers customers;
    private String orderId;
    private  String itemName;
    private int quantity;
    private int totalBillAmt;

    public Order(Customers customers, String orderId, String itemName, int quantity, int totalBillAmt) {
        this.customers = customers;
        this.orderId = orderId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.totalBillAmt = totalBillAmt;
    }

    public Order() {
    }

    public Order(Order quantity) {
    }



    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        Random random = new Random();
        this.orderId = orderId + "-"+ random.nextInt(500);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
        setOrderId(itemName);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalBillAmt() {
        return totalBillAmt;
    }

    public void setTotalBillAmt(int totalBillAmt) {
        this.totalBillAmt = totalBillAmt;
    }

    public void prepareOrder(){
        System.out.println("preparing Order with id:"+" "+ getOrderId() +" "+ "& name of the Customer is" +" "+ getCustomers().getName());
    }
}
