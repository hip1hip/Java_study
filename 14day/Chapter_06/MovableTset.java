//p261 문제 04번 개발자 홍인표

class Point {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x= " + x + ", y=" + y + "]";
    }

}

class MovablePoint extends Point {
    private int xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    int getxSpeed() {
        return xSpeed;
    }

    int getySpped() {
        return ySpeed;
    }

    void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint [x=" + getX() + ",y=" + getY() + "xSpeed=" + xSpeed + "ySpeed = " + ySpeed + "]";

    }

}