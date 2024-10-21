import java.util.Scanner;
abstract class Shape {
    protected int dimension1;
    protected int dimension2;

   
    abstract void printArea();
}


class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        this.dimension1 = width;
        this.dimension2 = height;
    }

    @Override
    void printArea() {
        int area = dimension1 * dimension2; // Area = width * height
        System.out.println("Area of Rectangle: " + area);
    }
}


class Triangle extends Shape {
    public Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        this.dimension1 = radius; // Radius
    }

    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

public class Shapes {
    public static void main(String[] args) {
        System.out.println("enter the dimensions of the rectangle:(length and breadth):");
        Scanner sc = new Scanner(System.in);
        int l1=sc.nextInt();
        int b1=sc.nextInt();
        Shape rectangle = new Rectangle(l1, b1);
        rectangle.printArea();
        System.out.println("enter the dimensions of the traingle:(base and height):");
        int b2 = sc.nextInt();
        int h1=sc.nextInt();
        Shape triangle = new Triangle(b2, h1);
        triangle.printArea();
        System.out.println("enter the dimensions of the circle:(radius):");
        int r1=sc.nextInt();
        Shape circle = new Circle(r1);
        circle.printArea();
    }
}