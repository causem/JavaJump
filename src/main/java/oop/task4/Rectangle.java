package oop.task4;

public class Rectangle implements Shape {
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public void area() {
        System.out.println("The area of rectangle is:");
        System.out.println(width*height);
    }
}
