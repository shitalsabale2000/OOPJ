
abstract class Shape {
    
    public abstract double area();
}


class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}


public class ShapeAreaCalculatorQ6 {
    public static void main(String[] args) {
      
        Rectangle rect = new Rectangle(5, 10);
        Circle circ = new Circle(7);

        
        System.out.println("Rectangle Area = " + (int)rect.area());
        System.out.println("Circle Area = " + (int)circ.area());
    }
}
