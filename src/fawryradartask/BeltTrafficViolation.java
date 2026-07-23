/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawryradartask;

/**
 *
 * @author doksh
 */
public class BeltTrafficViolation implements TrafficViolation{
    private int fineAmount = 100;

    @Override
    public boolean isViolationDone(CarInterface car) {
        if(!car.getSeatBeltStatus()){
            return true;
        }
        
        return false;
    }

    @Override
    public int getFineAmount() {
        return this.fineAmount;
    }

    @Override
    public String getDescription(CarInterface car) {
        return "- Seatbelt not fastned: " + this.getFineAmount() + " EGP";
    }
    
    
    
}
