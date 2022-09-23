class Starfish extends Shape {
    int radius;

    public Starfish(int radius) {
        this.radius = radius;
    }

    public Starfish(Double i, Double j, Double x) {
    }

    public void draw() {
        System.out.println("불가사리를 그리다.");

    }

    public double findArea() {
        return pi * radius * radius * radius;
    }
}
