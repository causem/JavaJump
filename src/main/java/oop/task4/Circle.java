package oop.task4;

public class Circle implements Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("The area of circle is:");
        System.out.println(Math.PI*radius*radius);
    }
}
