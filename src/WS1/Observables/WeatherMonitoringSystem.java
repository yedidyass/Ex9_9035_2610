package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemepratureSensor;
import WS1.Observers.Observer;

public class WeatherMonitoringSystem {
    protected static WeatherMonitoringSystem instance;
    protected AlarmClock nimbus1Clock;
    protected Sensor nimbus1PresureSensor;
    protected Sensor nimbus1TempratureSensor;
    protected PressureTrendSensor presureTrendSensor;

    protected WeatherMonitoringSystem() {
        System.out.println("WeatherMonitoringSystem was created");
        nimbus1Clock = Nimbus1Clock.theInstance();
        nimbus1PresureSensor = new Nimbus1PressureSensor("pressure", 1100);
        nimbus1TempratureSensor = new Nimbus1TemepratureSensor("temperature", 700);
        presureTrendSensor = new PressureTrendSensor();
        this.addPressureObserver(presureTrendSensor);
    }

    public static WeatherMonitoringSystem theInstance() {
        if (instance == null) {
            instance = new WeatherMonitoringSystem();
        }
        return instance;
    }

    public void addPressureObserver(Observer observer) {
        nimbus1PresureSensor.registerObserver(observer);
        System.out.println(observer.getClass().getSimpleName() + " observes pressure");
    }

    public void addPressureTrendObserver(Observer observer) {
        presureTrendSensor.registerObserver(observer);
        System.out.println(observer.getClass().getSimpleName() + " observes pressure trend");
    }

    public void addTemperatureObserver(Observer observer) {
        nimbus1TempratureSensor.registerObserver(observer);
        System.out.println(observer.getClass().getSimpleName() + " observes temperature");
    }
}
