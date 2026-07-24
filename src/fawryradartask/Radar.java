/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawryradartask;

import java.util.ArrayList;

/**
 *
 * @author doksh
 */
public class Radar {
    
    private ArrayList<TrafficViolation> violations;
    
    public Radar(ArrayList<TrafficViolation> violations) {
        this.violations = violations;
    }
    
    public void checkViolation(CarInterface car){
        ArrayList<TrafficViolation> actualViolations = new ArrayList<>();

        for(TrafficViolation violation : violations){
            if(violation.isViolationDone(car)){
                actualViolations.add(violation);
            }
        }
        if(actualViolations.size() != 0){
            Ticket ticket = new Ticket(car, actualViolations);
            car.addTicket(ticket);
            System.out.println(ticket.toString());
        }
        else{
            
        }
    }
    
    
    
}
