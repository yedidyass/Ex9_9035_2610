package WS1.Observables;

import WS1.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observerCollection;

    public Observable(){
        this.observerCollection = new ArrayList<Observer>();
    }
    public void registerObserver(Observer observer) {
        observerCollection.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observerCollection.remove(observer);
    }

    public void notifyObservers(int data) {
        for (Observer observer : observerCollection)
            observer.update(data);
    }
}
