
interface Shape {
    void calculateArea();
}


class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area = " + String.format("%.2f", area));
    }
}


class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area = " + area);
    }
}
class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        double area = side * side;
        System.out.println("Square Area = " + area);
    }
}

public class ShapeCalculatorDemoQ27 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);        
        Shape rectangle = new Rectangle(10, 5); 
        Shape square = new Square(4);         
        circle.calculateArea();    
        rectangle.calculateArea(); 
        square.calculateArea();  
   
}
}