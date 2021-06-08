package WS1.Observers;

public class LogPressObserver implements Observer {
    protected Log itsLog;

    public LogPressObserver(Log log) {
        System.out.println("LogPressObserver was created");
        this.itsLog = log;
    }

    @Override
    public void update(int data) {
        itsLog.printPressure(data);
    }
}
