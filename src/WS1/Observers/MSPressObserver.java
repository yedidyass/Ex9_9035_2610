package WS1.Observers;

public class MSPressObserver implements Observer {
    private MonitoringScreen itsMonitoringScreen;
    public MSPressObserver(MonitoringScreen itsMonitoringScreen){
        this.itsMonitoringScreen=itsMonitoringScreen;
    }
    @Override
    public void update(int data) {
        itsMonitoringScreen.displayPressure(data);
    }
}
