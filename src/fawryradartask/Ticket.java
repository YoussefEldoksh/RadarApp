/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawryradartask;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author doksh
 */
public class Ticket {
    
    private CarInterface car;
    private ArrayList<TrafficViolation> violations;
    private LocalDateTime timeStamp;
    private int fineAmount;
    

    public Ticket(CarInterface car, ArrayList<TrafficViolation> violations) {
        this.car = car;
        this.violations = violations;
        this.timeStamp = LocalDateTime.now();
        calculateFineTotal();
    }
    
    public CarInterface getCar() {
        return car;
    }


    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public int getFineAmount() {
        return fineAmount;
    }
    
    private void calculateFineTotal(){
        for(TrafficViolation violation : violations){
            fineAmount += violation.getFineAmount();
        }
    }
    
    @Override
    public String toString(){
        String s = "Traffic fine for car " + car.getPlate() + "\n" 
               + "Total amount: " + fineAmount + "\n"
               +"Violations:\n";
       for(TrafficViolation violation : violations){
           s += violation.getDescription(car);
           s += "\n"; 
       }
        return s;   
    }
    
    
}
