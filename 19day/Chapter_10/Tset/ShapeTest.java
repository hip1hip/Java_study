package Tset;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        List<Shape> rectagles = findShapes(Shape.shapes, s -> s.getType().equals("사각형"));
        System.out.print("사각형 = ");
        System.out.println(rectagles);
        List<Shape> redNSmallShapes = findShapes(Shape.shapes, s -> s.getColor().equals("빨간색") && s.getArea() <= 12.0);

        System.out.println("빨간 도형 (면적 <=12.0 : ");
        System.out.println(redNSmallShapes);
    }

    static List<Shape> findShapes(List<Shape> shapes, String type, String color, Double area) {
        List<Shape> result = new ArrayList<>();

        // for (Shape s : shapes) {
        // if (type != null) {
        // if (s.getType().equals(type))
        // result.add(s);
        // } else {
        // if (s.getColor().equals(color) && s.getArea() <= area)
        // result.add(s);

        // }
        // }
        for (Shape a : animals)
            if (p.test(a))
                result.add(a);
        return result;

    }

}
