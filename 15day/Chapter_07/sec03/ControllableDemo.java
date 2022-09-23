package sec03;

public class ControllableDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        Computer com = new Computer();
        XBOX xb = new XBOX();
        tv.turnOff();
        tv.turnOn();
        tv.repair();
        com.turnOn();
        com.turnOff();
        com.repair();
        xb.turnOff();
        xb.turnOn();
        xb.repair();

        Controllable.reset();
    }
}
