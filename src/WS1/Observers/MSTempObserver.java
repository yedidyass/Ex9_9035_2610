package WS1.Observers;

public class MSTempObserver implements Observer {
    private MonitoringScreen itsMonitoringScreen;

    public MSTempObserver(MonitoringScreen itsMonitoringScreen) {
        System.out.println("MSTempObserver was created");
        this.itsMonitoringScreen = itsMonitoringScreen;
    }

    @Override
    public void update(int data) {
        itsMonitoringScreen.displayTemperature(data);
    }
}
