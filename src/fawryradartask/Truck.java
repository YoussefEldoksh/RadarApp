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
public class Truck implements CarInterface {
   
    private float maxSpeed = 60;
    private String plate;
    private float speed;
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private boolean seatBeltFastened;

    public Truck(String plate, float speed, boolean seatBeltFastened) {
        this.plate = plate;
        this.speed = speed;
        this.seatBeltFastened = seatBeltFastened;
    }
    
    @Override
    public String getPlate() {
        return plate;
    }

    @Override
    public float getSpeed() {
        return speed;
    }


    @Override
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    @Override
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
    
    public int calculateSumOfAllTickets(){
        int ticketsSum = 0;
        for(Ticket ticket : tickets){
            ticketsSum += ticket.getFineAmount();
        } 
        return ticketsSum;
    }

    @Override
    public boolean getSeatBeltStatus() {
        return seatBeltFastened;
    }

    @Override
    public float getMaxSpeed() {
        return maxSpeed;
    }

}
