package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

public class MonitoringScreen {
    protected static MonitoringScreen monitoringScreen=null;
    private WeatherMonitoringSystem ws;
    private MSPressObserver mSPressObserver;
    private MSTempObserver msTempObserver;
    public MonitoringScreen(WeatherMonitoringSystem ws) {
        this.ws=ws;
        mSPressObserver=new MSPressObserver(this);
        ws.addPressureObserver(mSPressObserver);
        msTempObserver=new MSTempObserver(this);
        ws.addTemperatureObserver(msTempObserver);
    }
   /* public static MonitoringScreen theInstance(WeatherMonitoringSystem ws){
        if(monitoringScreen==null)
            monitoringScreen=new MonitoringScreen(ws);
        return monitoringScreen;
    }
*/
    public void displayTemperature(int data){
        System.out.format("MonitoringScreen: temperature = %d Celsius\n",data);
    }
    public void displayPressure(int data){
        System.out.format("MonitoringScreen: pressure = %d millibar\n",data);
    }
}
