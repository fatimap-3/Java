package assignment9;

import java.util.Scanner;

public class RegularPolygonTest {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n = 3;
        this.side = 1.0;
        this.x = 0.0;
        this.y = 0.0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0.0;
        this.y = 0.0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        return (this.n * Math.pow(this.side, 2)) / (4 * Math.tan(Math.PI / this.n));
    }
    
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1: ");
        System.out.println("Perimeter = " + polygon1.getPerimeter());
        System.out.println("Area = " + polygon1.getArea());

        System.out.println("\nPolygon 2: ");
        System.out.println("Perimeter = " + polygon2.getPerimeter());
        System.out.println("Area = " + polygon2.getArea());

        System.out.println("\nPolygon 3: ");
        System.out.println("Perimeter = " + polygon3.getPerimeter());
        System.out.println("Area = " + polygon3.getArea());
    }
}
