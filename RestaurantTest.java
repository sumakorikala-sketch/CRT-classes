class Restaurant {

    private String order;
    private boolean orderPlaced = false;
    private boolean orderCooked = false;

    // Waiter places order
    synchronized void foodOrder(String orderName) {
        while (orderPlaced) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        order = orderName;
        System.out.println("Thread waiter: food ordered -> " + order);
        orderPlaced = true;
        notifyAll();
    }

    // Cook cooks order
    synchronized void cookedOrder() {
        while (!orderPlaced) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Thread cook: Chef has received the order -> " + order);
        System.out.println("Thread cook: Cooking under progress...");
        System.out.println("Thread cook: Order is ready");
        orderCooked = true;
        notifyAll();
    }

    // Customer receives order
    synchronized void receivedOrder() {
        while (!orderCooked) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Thread customer: Customer has received the order -> " + order);
    }
}

public class RestaurantTest {

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Thread customer = new Thread(() -> {
            r.receivedOrder();
        }, "customer");

        Thread waiter = new Thread(() -> {
            r.foodOrder("dead by chocolate waffle");
        }, "waiter");

        Thread cook = new Thread(() -> {
            r.cookedOrder();
        }, "cook");

        customer.start();
        waiter.start();
        cook.start();
    }
}
