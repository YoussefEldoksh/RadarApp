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
    private int violationsCount = 0;
    
    
    @Override
    public int getViolationsCount() {
        return violationsCount;
    }
    @Override
    public boolean isViolationDone(CarInterface car) {
        if(!car.getSeatBeltStatus()){
            violationsCount +=1;
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

    @Override
    public String getViolationName() {
        return "Belt Not Fastned Violation";
    }
    
    
    
}
