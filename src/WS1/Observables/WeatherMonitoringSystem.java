package WS1.Observables;

public class WeatherMonitoringSystem {
    protected static WeatherMonitoringSystem instance;

    protected WeatherMonitoringSystem() {    }

    public static WeatherMonitoringSystem theInstance() {
        if (null == instance)
            instance = new WeatherMonitoringSystem();
        return instance;
    }
}
