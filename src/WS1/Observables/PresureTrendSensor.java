package WS1.Observables;

import WS1.Observers.Observer;

public class PresureTrendSensor extends Observable implements Observer {
    @Override
    public void update(int data) {
        this.check(data);
    }


    public enum Trend {
        RISING,
        STABLE,
        FALLING
    }

    public int lastReding1;
    public int lastReding2;
    public int lastReding3;
    public Trend presureState;
    public Trend lastState;

    public Trend calc(int data) {
        lastReding3 = lastReding2;
        lastReding2 = lastReding1;
        lastReding1 = data;
        if (lastReding1 < lastReding2 && lastReding2 < lastReding3)
            return Trend.RISING;
        else if (lastReding1 > lastReding2 && lastReding2 > lastReding3)
            return Trend.FALLING;
        else
            return Trend.STABLE;
    }

    public void check(int data) {
        lastState = calc(data);
        if (presureState != lastState)
            notifyObservers(lastState.ordinal());
        presureState = lastState;
    }
}
