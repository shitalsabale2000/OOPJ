
abstract class Shape {
    public abstract void draw();
}


class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}


class Rectangle extends Shape {
    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}
public class DrawingQ13 {
    public static void main(String[] args) {
        
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(5, 10);
        circle.draw();
        rectangle.draw();
}
}