package observer.shopApp;

import observer.shopApp.notification.EmailMessage;
import observer.shopApp.notification.MobileApp;
import observer.shopApp.notification.SmsMessage;
import observer.shopApp.order.Order;
import observer.shopApp.order.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Order order=new Order(100L, OrderStatus.ZAREJESTROWANE);

        SmsMessage sms=new SmsMessage();
        EmailMessage email = new EmailMessage();
        MobileApp mobileApp = new MobileApp();

        order.registerObserver(sms,email,mobileApp);
        order.notifyObservers();
        order.unregisterObserver(sms,email);
        System.out.println("_____________________");
        order.changeOrderStatus(OrderStatus.WYSLANE);

    }
}
