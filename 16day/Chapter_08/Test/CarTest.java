package Test;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

//342p 도전과제 1,2,3번 개발자 홍인표

class Car {
    private String model;

    public Car(String model) {
        this.model = model;

    }

    @Override
    public String toString() {
        return "[" + model + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car)
            return model.equals(((Car) obj).model);
        else
            return false;
    }

}

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜져");

        if (myCar.equals(yourCar))
            System.out.printf("자동차 모델이 둘다 %s로 동일하다. \n ", myCar);
        else
            System.out.printf("내 자동차는 %s, 너의 자동차는%s로 모델이 다르다\n", myCar, yourCar);

        SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy");
        String s = MessageFormat.format("날짜 : {0}, 자동차 모델 = {1} , 운전자({2})", f.format(new Date()), myCar, "홍인표");
        System.out.println(s);

        StringTokenizer st = new StringTokenizer(s, "[=],()");
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
