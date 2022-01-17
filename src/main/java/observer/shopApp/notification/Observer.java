package observer.shopApp.notification;


import observer.shopApp.order.Order;

public interface Observer {
    void update (Order order);
}
