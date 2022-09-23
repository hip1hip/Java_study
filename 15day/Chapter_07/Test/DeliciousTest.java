package Test;

interface Edible {
    void eat();
}

interface Sweetable {
    void sweet();
}

public interface DeliciousTest extends Edible, Sweetable {

}
