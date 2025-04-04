import java.util.Scanner;

class Shape {
    public void calculateArea() {
        System.out.println("Calculating area in Shape class.");
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length:");
        int length = obj.nextInt();
        System.out.println("Enter breadth:");
        int breadth = obj.nextInt();
        Shape myShape = new Shape();
        myShape.calculateArea();
        Shape myRect = new Rectangle(length, breadth);
        myRect.calculateArea();
        obj.close();
    }
}
