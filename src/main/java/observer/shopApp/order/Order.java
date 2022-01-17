package observer.shopApp.order;

import observer.shopApp.notification.Observer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {
    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObserver = new HashSet<>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", orderStatus=" + orderStatus +
                '}';
    }

    @Override
    public void registerObserver(Observer... observers) {
        registeredObserver.addAll(Arrays.asList(observers));

    }

    @Override
    public void unregisterObserver(Observer... observers) {
        Arrays.asList(observers).forEach(registeredObserver::remove);
    }

    @Override
    public void notifyObservers() {
    registeredObserver.forEach(observer -> observer.update(this));
    }
    public void changeOrderStatus(OrderStatus orderStatus){
        setOrderStatus(orderStatus);
        notifyObservers();
    }
}
