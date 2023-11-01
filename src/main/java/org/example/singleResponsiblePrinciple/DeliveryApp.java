package org.example.singleResponsiblePrinciple;

public class DeliveryApp {
    private Order order;

    public DeliveryApp() {
    }

    public DeliveryApp(Order order) {
        this.order = order;
    }

    public void Delivery(){
        // Here, we would want to interface with another
        // system which actually assigns the task of
        // delivery to different persons
        // based on location, etc.

        System.out.println(
                "Order with order id as "
                        + this.order.getOrderId()
                        + " being delivered to "
                        + this.order.getCustomers().getName());
//        System.out.println(
//                "Order  has been  delivered to: "
//                        + this.order.getCustomers().getName()+ "Successfully");
  }
}
