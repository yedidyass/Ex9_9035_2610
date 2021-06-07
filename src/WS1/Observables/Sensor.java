package WS1.Observables;

public abstract class Sensor extends Observable {
    public int lastReding;
    public int interval;
    public String type;

    public Sensor(String type, int interval) {
        (AlarmClock.theInstance()).register(interval,new SensorAlarmListener(this));
    }

    public abstract int read();

    public void check() {
        int temp = read();
        if (temp != lastReding) {
            lastReding = temp;
            notifyObservers(temp);
        }
    }
}
