package com.epam.rd.autotasks.figures;

class Circle extends Figure{
    double rad;
    Point center;

    public Circle(Point center, double rad) {
        this.rad = rad;
        this.center = center;
    }

    @Override
    public String pointsToString() {
        return "("+center.toString()+")";
    }

    @Override
    public String toString() {
        return "Circle["+pointsToString()+rad+"]";
    }

    @Override
    public Point leftmostPoint() {
        return new Point(center.getX()-rad, center.getY());
    }

    @Override
    public double area(){
        return Math.PI * rad*rad;
    }

}
