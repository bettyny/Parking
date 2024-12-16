/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author betty
 */
public class ParkedCar {
    String carModel;
    String carColor;
    String carMake;
    
    long minParked;
    String licenseLetters;
    
    public String model(){
        Scanner input = new Scanner(System.in);
        System.out.println("Car model: ");
        carModel = input.next();
        return carModel;
    }
    
    public String color(){
        Scanner input = new Scanner(System.in);
        System.out.println("Car color: ");
        carColor = input.next();
        return carColor;
    }
    public String make(){
        Scanner input = new Scanner(System.in);
        System.out.println("Car make: ");
        carMake = input.next();
        return carMake;
    }
    
   
    
    public String licensePlates(){
        Scanner input = new Scanner(System.in);
        System.out.println("License plate numbers: ");
        licenseLetters = input.next();
        return licenseLetters;
    }
    
    public long parkedTime(){
        Scanner input = new Scanner(System.in);
        String timeArrived;
        String timeParked;
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Time Officer arrived in HH:MM format: ");
        timeArrived = input.nextLine();
        LocalTime time1 = LocalTime.parse(timeArrived, format);
        System.out.println("Time car arrived in HH:MM: ");
        timeParked = input.nextLine();
        LocalTime time2 = LocalTime.parse(timeParked, format);
        Duration duration = Duration.between(time2, time1);
        minParked = duration.toMinutes();
        return minParked;
    }
    
}
