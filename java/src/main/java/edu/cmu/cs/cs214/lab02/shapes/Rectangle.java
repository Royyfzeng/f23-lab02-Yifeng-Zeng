package edu.cmu.cs.cs214.lab02.shapes;

public final class Rectangle implements Shape {
    private double height;
    private double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public Rectangle(Rectangle o1) {
        this.height = o1.height;
        this.width = o1.width;
    }
    @Override
    public double getArea() {
        return height * width;
    }
}
