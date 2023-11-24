package sem2cosc1047lab;

import java.util.Scanner;

public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }


    static class Triangle extends GeometricObject {
        private double side1;
        private double side2;
        private double side3;

        public Triangle() {
            this.side1 = 1.0;
            this.side2 = 1.0;
            this.side3 = 1.0;
        }

        public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
            if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
                throw new IllegalTriangleException("Triangle inequality violation: The sum of any two sides must be greater than the third side.");
            }
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        public void setSide1(double side1) {
            this.side1 = side1;
        }

        public void setSide2(double side2) {
            this.side2 = side2;
        }

        public void setSide3(double side3) {
            this.side3 = side3;
        }

        public double getPerimeter() {
            return side1 + side2 + side3;
        }

        public String toString() {
            return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter side1: ");
            double side1 = input.nextDouble();
            System.out.print("Enter side2: ");
            double side2 = input.nextDouble();
            System.out.print("Enter side3: ");
            double side3 = input.nextDouble();

            try {
                Triangle t = new Triangle(side1, side2, side3);
                double perimeter = t.getPerimeter();
                System.out.println("The perimeter is " + perimeter);
                String triangleInfo = t.toString();
                System.out.println(triangleInfo);
            } catch (IllegalTriangleException e) {
                System.out.println("IllegalTriangleException: " + e.getMessage());
            }
        }
    }

    static class IllegalTriangleException extends Exception {
        public IllegalTriangleException() {
        }

        public IllegalTriangleException(String message) {
            super(message);
        }
    }
}