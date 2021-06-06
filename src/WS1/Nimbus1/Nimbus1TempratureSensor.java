package WS1.Nimbus1;

public class Nimbus1TempratureSensor {
    private int interval = 60000;
    private int lastReding = 0;

    public int getInterval() {
        return interval;
    }

    public int read() {
        // TODO: 06/06/2021 what read() need to return
        return 1;
    }

    public void check() {
        int temp = read();
        if (temp != lastReding) {
            lastReding = temp;
            //notifyObservers(temp);
        }
    }
}
