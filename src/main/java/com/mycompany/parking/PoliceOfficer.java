/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking;
import java.util.Scanner;
//import java.time.Duration;
/**
 *
 * @author betty
 */
public class PoliceOfficer {
     String name;
     String badgeNum;
     boolean expiredTime;
    public String officerName(){
       
        Scanner input = new Scanner (System.in);
        System.out.println("Office Name: ");
        name = input.next();
        return name;
        
        
    }
    public String officerBadge(){
        Scanner input = new Scanner(System.in);
        System.out.println("Officer badge#: ");
        badgeNum = input.next();
        return badgeNum;
    }
    
    public boolean timeExpired(long timePark, long timePaid){
        expiredTime = timePark > timePaid;
        return expiredTime;
    }
    
    //messy method
    public void Ticket(){
        ParkedCar car = new ParkedCar();
        ParkingMeter meter = new ParkingMeter();
        ParkingTicket ticket = new ParkingTicket();
        
        //all variables needed
        String carModel;// done
        String carMake;// done
        String licensePlate; //done
        long parkingTime;// done
        long timeFine;
        double finedAmount; //done
        long paidTime = meter.parkedTimeBought();
        long paidTimehrs;
        String policeName;
        String policeBadge;
        
        //getting info
        carModel = car.model();
        carMake = car.make();
        licensePlate = car.licensePlates();
        parkingTime = car.parkedTime();
        policeName = officerName();
        policeBadge = officerBadge();
        
        
        
        if(timeExpired(parkingTime, paidTime) == true){
            //convert fromm mins to hrs
           timeFine = parkingTime - paidTime;
           paidTimehrs = timeFine/60;
           finedAmount = ticket.fineAmount(paidTimehrs);
            System.out.println(carModel + " " + carMake + " " + licensePlate);
        System.out.println("Minutes parked: " + parkingTime);
        System.out.println("Minutes paid for: " + paidTime);
        System.out.println("FIned amount if any: " + finedAmount);
        
        ticket.policeNameBadge(policeName, policeBadge);
           
        }
        
        /*System.out.println(carModel + " " + carMake + " " + licensePlate);
        System.out.println("Minutes parked: " + parkingTime);
        System.out.println("Minutes paid for: " + paidTime);
        System.out.println("FIned amount if any: " + finedAmount);
        
        ticket.policeNameBadge(policeName, policeBadge);*/
        
        
        
       
    }
    
}
