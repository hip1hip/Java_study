public class FireBall extends Circle {
    private String color;

    public FireBall(String color) {
        this.color = color;
    }

    public void findColor() {
        System.out.println(color + "강력한 볼이다.");
    }

    public void findVolume() {
        System.out.println("크기는 4/3*(파이*반지름*반지름*반지름)*2 이다.");
    }

}
