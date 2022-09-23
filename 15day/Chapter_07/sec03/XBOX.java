package sec03;

public class XBOX implements Controllable {

    @Override
    public void turnOn() {
        System.out.println("XBOX를 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("XBOX를 끈다.");
    }

}
