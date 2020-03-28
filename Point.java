package com.HorstmannChapter2;

final class Point {
    final private double x;
    final private double y;
    public Point(){
        x=0;
        y=0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY() {
        return y;
    }
    public Point translate(double shiftX, double shiftY){
        return new Point(this.x+shiftX,this.y+shiftY);
    }
    public Point scale(double coeff){
        return new Point(this.x*coeff,this.y*coeff);
    }
}
