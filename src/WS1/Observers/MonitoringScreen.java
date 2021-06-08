package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

public class MonitoringScreen {
    protected static MonitoringScreen monitoringScreen = null;
    private WeatherMonitoringSystem ws;
    private MSPressObserver mSPressObserver;
    private MSTempObserver msTempObserver;

    public MonitoringScreen(WeatherMonitoringSystem ws) {
        System.out.println("MonitoringScreen was created");
        this.ws = ws;
        msTempObserver = new MSTempObserver(this);
        ws.addTemperatureObserver(msTempObserver);
        mSPressObserver = new MSPressObserver(this);
        ws.addPressureObserver(mSPressObserver);
    }

    public void displayTemperature(int data) {
        System.out.format("MonitoringScreen: temperature = %d Celsius\n", data);
    }

    public void displayPressure(int data) {
        System.out.format("MonitoringScreen: pressure = %d millibar\n", data);
    }
}
