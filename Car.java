package com.HorstmannChapter2;

public class Car {
    private double currentCoordinate;
    private double tank;
    private double consumption;
    public Car(double consumption){
        currentCoordinate=0;
        tank=50;
        this.consumption=consumption;
    }
    public void fillTank(){
        this.tank=50;
    }
    public void goForward(double km){
        if(tank>km*consumption){
            currentCoordinate+=km;
            tank-=km/consumption;
        }
        else {
            currentCoordinate+=tank*consumption;
            System.out.println("Your tank is empty!");
        }
    }
    public void goBack(double km){
        if(tank>km*consumption){
            currentCoordinate-=km;
            tank-=km/consumption;
        }
        else {
            currentCoordinate-=tank*consumption;
            tank=0;
            System.out.println("Your tank is empty!");
        }
    }
    public double fuelLevel(){
        return this.tank;
    }
    public double getCurrentCoordinate(){
        return currentCoordinate;
    }
}
