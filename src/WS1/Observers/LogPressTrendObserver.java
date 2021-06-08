package WS1.Observers;

public class LogPressTrendObserver implements Observer {
    protected Log itsLog;
    public LogPressTrendObserver(Log log){
        System.out.println("LogPressTrendObserver was created");
        this.itsLog=log;
    }
    @Override
    public void update(int data) {
         itsLog.printTrend(data);
    }
}
