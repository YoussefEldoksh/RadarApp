/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fawryradartask;

import java.util.ArrayList;

/**
 *
 * @author doksh
 */
public class FawryRadarTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<TrafficViolation> trafficRules = new ArrayList<>();
        trafficRules.add(new SpeedTrafficViolation());
        trafficRules.add(new BeltTrafficViolation());
        
        Radar radar = new Radar(trafficRules);
        
        Truck truck1 = new Truck("ABC1234", 40, true);
        PrivateCar mycar1 = new PrivateCar("ABC1334", 90, false);
        
        radar.checkViolation(mycar1);
        radar.checkViolation(mycar1);
        radar.checkViolation(mycar1);
        radar.checkViolation(mycar1);

        radar.checkViolation(truck1);
        
        System.out.println("total fine amount for mycar1 = " + mycar1.calculateSumOfAllTickets());        
        System.out.println("\n\n\n\n");
        
        for(Ticket ticket: truck1.getTickets()){
            System.out.println(ticket.toString());
        }
        

    }
    
}
