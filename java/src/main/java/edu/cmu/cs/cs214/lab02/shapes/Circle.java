package edu.cmu.cs.cs214.lab02.shapes;

public final class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(Circle o1) {
        this.radius = o1.radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
