/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorefisme;

/**
 *
 * @author Nazwajafni
 */
import java.util.ArrayList;
import java.util.List;

public class Latihan2{

    static abstract class Shape {
        abstract double area();
    }

    static class Circle extends Shape {
        double r;
        Circle(double r) { this.r = r; }
        double area() { return Math.PI * r * r; }
    }

    static class Rectangle extends Shape {
        double w, h;
        Rectangle(double w, double h) {
            this.w = w;
            this.h = h;
        }
        double area() { return w * h; }
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(4));
        shapes.add(new Rectangle(3, 5));
        shapes.add(new Circle(2));

        double total = 0;
        for (Shape s : shapes)
            total += s.area();

        System.out.println("Total area = " + total);
    }
}