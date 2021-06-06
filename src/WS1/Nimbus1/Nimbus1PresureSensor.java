package WS1.Nimbus1;

import WS1.Observables.Sensor;

public class Nimbus1PresureSensor extends Sensor {
    public RandomSupplier rnd = new RandomSupplier();

    public Nimbus1PresureSensor(String type, int interval) {
        super(type, interval);
    }

    @Override
    public int read() {
        return rnd.getRnd().nextInt(1050 - 950) + 950;
    }
}
