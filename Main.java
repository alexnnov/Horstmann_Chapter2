package com.HorstmannChapter2;

public class Main {
    public static void main(String[] args) {
        //-----------------------------
        //Test for Point
	Point myPoint=new Point(9,9);
        System.out.println("x= "+myPoint.getX()+"y= "+myPoint.getY());
        myPoint=myPoint.translate(1,1);
        System.out.println("x= "+myPoint.getX()+"y= "+myPoint.getY());
        myPoint=myPoint.scale(2);
        System.out.println("x= "+myPoint.getX()+"y= "+myPoint.getY());
        //------------------------------
        //Test for car
        Car car=new Car(2);
        car.goForward(10);
        System.out.println("fuel level is: "+car.fuelLevel());
        System.out.println("current coordinate: "+car.getCurrentCoordinate());
        car.goForward(1000);
        System.out.println("fuel level is: "+car.fuelLevel());
        System.out.println("current coordinate: "+car.getCurrentCoordinate());
        car.goBack(100);
        System.out.println("fuel level is: "+car.fuelLevel());
        System.out.println("current coordinate: "+car.getCurrentCoordinate());


    }
}
