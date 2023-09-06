package edu.cmu.cs.cs214.lab02;

// import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 10);
        Renderer renderer = new Renderer(rectangle);
        renderer.draw();
    }
}
