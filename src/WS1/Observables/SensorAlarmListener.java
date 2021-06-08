package WS1.Observables;

public class SensorAlarmListener implements AlarmListener {
    public Sensor itsSensor;

    public SensorAlarmListener(Sensor sensor) {
        this.itsSensor = sensor;
    }

    @Override
    public void wakeup() {
        itsSensor.check();
    }
}
