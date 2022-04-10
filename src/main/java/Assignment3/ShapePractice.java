package Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class ShapePractice {
    /*
    Implement a group of classes that have common behavior/state as Shape.
    Create Circle, Rectangle and Square for now as later on we may need more shapes.
    They should have the ability to calculate the area. They should be able to compare using area.
    Please write a program to demonstrate the classes and comparison.
    You can use either abstract or interface. Comparator or Comparable interface.
     */
    public static void main(String[] args) {
        Shape circle1 = new Circle(3);
        Shape circle2 = new Circle(6);
        Shape rectangle1 = new Rectangle(4.3, 5.1);
        Shape rectangle2 = new Rectangle(7.8, 2.3);
        Shape square1 = new Square(5);
        Shape square2 = new Square(3.5);
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(square1.toString());
        System.out.println(square2.toString());
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle1);
        shapeList.add(circle2);
        shapeList.add(rectangle1);
        shapeList.add(rectangle2);
        shapeList.add(square1);
        shapeList.add(square2);
        Collections.sort(shapeList, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                if (o1.getArea() == o2.getArea()) {
                    return 0;
                } else if (o1.getArea() < o2.getArea()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        System.out.println(shapeList.toString());
    }
}

//  Circle, Rectangle and Square classes
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " " +
                "area=" + getArea() +
                '}' + "\n";
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                " " + "area=" + getArea() +
                '}' + "\n";
    }
}

class Square implements Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                " " + "area=" + getArea() +
                '}' + "\n";
    }
}
