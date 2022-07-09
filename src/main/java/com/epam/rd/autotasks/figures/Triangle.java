package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    Point pointA;
    Point pointB;
    Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }


    @Override
    public String pointsToString() {
        return "("+pointA.toString()+")("+pointB.toString()+")("+pointC.toString()+")";
    }

    @Override
    public Point leftmostPoint() {
        if(pointA.getX()<= pointB.getX() && pointA.getX()<= pointC.getX()){
            return pointA;} else if (pointB.getX() <= pointC.getX() && pointB.getX() <= pointA.getX()){
            return pointB;} else return pointC;

    }

    @Override
    public double area() {
        return Math.abs((pointB.getX()-pointA.getX()) * (pointC.getY()-pointA.getY()) - (pointC.getX()-pointA.getX()) * (pointB.getY()-pointA.getY()))/2;
    }

}
