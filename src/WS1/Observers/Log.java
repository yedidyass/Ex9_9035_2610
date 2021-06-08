package WS1.Observers;

import WS1.Observables.PressureTrendSensor;
import WS1.Observables.WeatherMonitoringSystem;

public class Log {
    private WeatherMonitoringSystem ws;
    private LogPressObserver logPressObserver;
    private LogPressTrendObserver logPressTrendObserver;

    public Log(WeatherMonitoringSystem ws) {
        System.out.println("Log was created");
        this.ws = ws;
        logPressObserver = new LogPressObserver(this);
        ws.addPressureObserver(logPressObserver);
        logPressTrendObserver = new LogPressTrendObserver(this);
        ws.addPressureTrendObserver(logPressTrendObserver);
    }

    public void printPressure(int data) {
        System.out.format("Log: pressure = %d millibars\n", data);
    }

    public void printTrend(int data) {
        PressureTrendSensor.Trend trend;
        trend = PressureTrendSensor.Trend.values()[data];
        System.out.format("Log: pressure trend = %s\n", trend.name());
    }
}
