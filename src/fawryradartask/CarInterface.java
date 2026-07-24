/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fawryradartask;

import java.util.ArrayList;
    
/**
 *
 * @author doksh
 */
public interface CarInterface {
    String getPlate();
    float getSpeed();
    void addTicket(Ticket ticket);
    ArrayList<Ticket> getTickets();
    boolean getSeatBeltStatus();
    float getMaxSpeed();
    String getTotalFinesFormated();
    
}
