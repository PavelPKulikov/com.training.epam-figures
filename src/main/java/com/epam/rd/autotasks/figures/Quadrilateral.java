package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure{
    Point pointA;
    Point pointB;
    Point pointC;
    Point pointD;

    public Quadrilateral(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    @Override
    public String pointsToString() {
        return "("+pointA.toString()+")("+pointB.toString()+")("+pointC.toString()+")("+pointD.toString()+")";
    }

    @Override
    public Point leftmostPoint() {
        double xMin = Math.min(pointD.getX(), Math.min(pointC.getX(), Math.min(pointA.getX(), pointB.getX())));
        if (xMin == pointA.getX()) return pointA;
            else if (xMin == pointB.getX()) return pointB;
               else if (xMin == pointC.getX()) return pointC;
                   else return pointD;

        }


    @Override
    public double area() {
        return Math.abs((pointA.getX()-pointB.getX()) * (pointA.getY()+pointB.getY()) + (pointB.getX()-pointC.getX()) * (pointB.getY()+pointC.getY())+(pointC.getX()-pointD.getX()) * (pointC.getY()+pointD.getY())+(pointD.getX()-pointA.getX()) * (pointD.getY()+pointA.getY()))/2;
    }

}
