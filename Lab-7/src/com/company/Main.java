package com.company;

import java.util.ArrayList;

class Circle extends Figure {
    public double getArea() { return 0; }
    public double getPerimeter() { return 0; }
}

public class Main {

    public static void main(String[] args) {
	    Square square = new Square(2);
	    Triangle triangle = new Triangle(3,2,3);
	    Rectangle rectangle = new Rectangle(2,4);

	    ArrayList<Figure> figures = new ArrayList<Figure>();
	    figures.add(square);
	    figures.add(triangle);
	    figures.add(rectangle);
	    FigureController figuresController = new FigureController(figures);

        System.out.println("Square Area: " + square.getArea() + " Square Perimeter: " + square.getPerimeter());
        System.out.println("Triangle Area: " + triangle.getArea() + " Triangle Perimeter: " + triangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea() + " Rectangle Perimeter: " + rectangle.getPerimeter() + "\n");

        System.out.println("Max Area Value: " + figuresController.getMaxArea());
        System.out.println("Max Perimeter Value: " + figuresController.getMaxPerimeter() + "\n");

        Circle circle  = new Circle() {
            private double radius = 20;
            private double area = Math.PI * (this.radius * this.radius);
            private double perimeter = 2 * Math.PI * this.radius;
            public double getArea() {
                return this.area;
            }
            public double getPerimeter() {
                return this.perimeter;
            }
            public String getAnonymousClassName() {
                return "Circle";
            }
        };

        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea() + "\n");

        figures.add(circle);
        FigureController figuresControllerWithCircle = new FigureController(figures);
        System.out.println("Max Area Value: " + figuresControllerWithCircle.getMaxArea());
        System.out.println("Max Perimeter Value: " + figuresControllerWithCircle.getMaxPerimeter());

    }
}
