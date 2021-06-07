package WS1.Observables;

public class AlarmClockRecord {
    private int interval;
    private int intervalDecrement;
    private AlarmListener alarmListener;

    public AlarmClockRecord(int interval, AlarmListener alarmListener) {
        this.interval = interval;
        this.intervalDecrement = interval;
        this.alarmListener = alarmListener;
    }

    public int getInterval() {
        return interval;
    }

    public int getIntervalDecrement() {
        return intervalDecrement;
    }

    public AlarmListener getAlarmListener() {
        return alarmListener;
    }

    public void setIntervalDecrement(int intervalDecrement) {
        this.intervalDecrement = intervalDecrement;
    }
}
