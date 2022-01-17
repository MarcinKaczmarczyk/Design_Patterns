package observer.shopApp.notification;

import observer.shopApp.order.Order;

public class SmsMessage implements Observer {
    @Override
    public void update(Order order){
        System.out.println("SMS- Zamówienie nr "+order.getOrderNumber()+" zmieniło status na "+order.getOrderStatus());
    }
}
