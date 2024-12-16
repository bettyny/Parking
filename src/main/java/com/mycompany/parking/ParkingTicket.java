/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking;

/**
 *
 * @author betty
 */
public class ParkingTicket {
    String modelCar;
    String makeCar;
    String colorCar;
    String licensePlate;
    double fine;
    
    public String modelOfCar(String model){
        modelCar = model;
        return modelCar;
    }
    
    public String makeOfCar(String make){
        makeCar = make;
        return makeCar;
    }
    
    public String colorOfCar(String color){
        colorCar = color;
        return colorCar;
    }
    
    public String licensePlateNumber(String license){
        licensePlate = license;
        return licensePlate;
    }
    
    public double fineAmount(long extraTime){
        int i;
        if(extraTime <= 1){
            fine = 25;
        }
        else{
            fine = 25;
            for (i = 2; i <= extraTime; i++){
                fine = fine+ 10;
            }
        }
        //if statement to determine if true based on inpput from parking police officer class
        return fine;
    }
    //if true, pass the amount of time that was paid and the amount of time that was parked and subtract and 
    //charge fine accoorrding to how much
    
    public void policeNameBadge(String name, String badge){
        System.out.println(name + " " + badge);
    }
    
    //get input from user and pass to other classes
    //should I use methods or just one method to get the input. but will this have to return?
    
}
