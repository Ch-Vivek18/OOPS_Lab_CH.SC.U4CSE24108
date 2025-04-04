class Shape {
    double area;
    double perimeter;

    public Shape() {
        this.area = 0.0;
        this.perimeter = 0.0;
    }

    public void calculateArea() {
        System.out.println("The area is: " + area);
    }

    public void calculatePerimeter() {
        System.out.println("The perimeter is: " + perimeter);
    }
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
        System.out.println("The area of Circle is: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of Circle is: " + perimeter);
    }
}

class Square extends Shape {
    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        area = length * length;
        System.out.println("The area of Square is: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * length;
        System.out.println("The perimeter of Square is: " + perimeter);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square = new Square(4);
        square.calculateArea();
        square.calculatePerimeter();
    }
}
