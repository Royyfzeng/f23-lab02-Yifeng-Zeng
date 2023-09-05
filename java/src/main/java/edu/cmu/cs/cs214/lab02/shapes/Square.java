package edu.cmu.cs.cs214.lab02.shapes;

public final class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    public Square(Square o1) {
        this.sideLen = o1.sideLen;
    }
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}
