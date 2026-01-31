package gr.aueb.cf.cf9.ch17._12_enums.Orders;

public class Order {

    private OrderStatus status;

    public Order() {
        this.status = OrderStatus.PENDING;
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }

    public void printStatus() {
        switch (status) {
            case PENDING:
                System.out.println("Order is waiting for payment.");
                break;
            case PAID:
                System.out.println("Order has been paid.");
                break;
            case SHIPPED:
                System.out.println("Order is on the way.");
                break;
            case DELIVERED:
                System.out.println("Order delivered successfully.");
                break;
            case CANCELLED:
                System.out.println("Order was cancelled.");
                break;
        }
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.printStatus();

        order.updateStatus(OrderStatus.SHIPPED);
        order.printStatus();
    }
}