package WS1.Observables;

import WS1.Observers.Observer;

public class PresureTrendSensor extends Observable implements Observer {
    @Override
    public void update(int data) {

    }

    enum Trend {
        INCREMENT,
        STABLE,
        DECREMENT
    }

    public int lastReding1;
    public int lastReding2;
    public int lastReding3;
    public Trend presureState;
    public Trend lastState;

    public Trend calc() {
        if (lastReding1 < lastReding2 && lastReding2 < lastReding3)
            return Trend.INCREMENT;
        else if (lastReding1 > lastReding2 && lastReding2 > lastReding3)
            return Trend.DECREMENT;
        else
            return Trend.STABLE;
    }
}
