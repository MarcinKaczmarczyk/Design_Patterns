package observer.shopApp.notification;

import observer.shopApp.order.Order;

public class EmailMessage implements Observer {
    @Override
    public void update(Order order){
        System.out.println("Email- Zamówienie nr "+order.getOrderNumber()+" zmieniło status na "+order.getOrderStatus());
    }


}
