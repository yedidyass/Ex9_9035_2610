package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PresureSensor;
import WS1.Nimbus1.Nimbus1TempratureSensor;
import WS1.Observers.MonitoringScreen;
import WS1.Observers.Observer;

public class WeatherMonitoringSystem {
    protected static WeatherMonitoringSystem instance;
    protected AlarmClock nimbus1Clock;
    protected Sensor nimbus1PresureSensor;
    protected Sensor nimbus1TempratureSensor;
    protected MonitoringScreen monitoringScreen;
    protected PresureTrendSensor presureTrendSensor;

    protected WeatherMonitoringSystem() {
        nimbus1Clock = Nimbus1Clock.theInstance();
        nimbus1PresureSensor = new Nimbus1PresureSensor("Pressure", 1100);
        nimbus1TempratureSensor = new Nimbus1TempratureSensor("temperature", 700);
        presureTrendSensor=new PresureTrendSensor();
        this.addPressureObserver(presureTrendSensor);
        monitoringScreen = new MonitoringScreen(this);
    }

    public static WeatherMonitoringSystem theInstance() {
        if (instance == null) {
            instance = new WeatherMonitoringSystem();
        }
        return instance;
    }

    public void addPressureObserver(Observer observer) {
        nimbus1PresureSensor.registerObserver(observer);
    }
    public void addPressureTrendObserver(Observer observer) {
        presureTrendSensor.registerObserver(observer);
    }
    public void addTemperatureObserver(Observer observer) {
        nimbus1TempratureSensor.registerObserver(observer);
    }
}
