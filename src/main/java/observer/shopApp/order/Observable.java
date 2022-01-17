package observer.shopApp.order;

import observer.shopApp.notification.Observer;

public interface Observable {
    void registerObserver (Observer... observer);
    void unregisterObserver(Observer... observer);
    void notifyObservers();
}
