package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public final class Renderer {
    public Shape shape;

    Renderer(Shape shape) {
        if (shape == null) {
            throw new IllegalArgumentException("Input should not be NULL");
        }
        if (shape instanceof Rectangle) {
            this.shape = new Rectangle((Rectangle) shape);
        } else if (shape instanceof Circle) {
            this.shape = new Circle((Circle) shape);
        } else if (shape instanceof Square) {
            this.shape = new Square((Square) shape);
        } else {
            throw new IllegalArgumentException("Illegal argument.");
        }
    }

    void draw() {
        double area = this.shape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
