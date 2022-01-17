package observer.shopApp.notification;

import observer.shopApp.order.Order;

public class MobileApp implements Observer {
    @Override
    public void update(Order order){
        System.out.println("MobileApp- Zamówienie nr "+order.getOrderNumber()+" zmieniło status na "+order.getOrderStatus());
    }
}
