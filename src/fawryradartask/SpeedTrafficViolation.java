/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawryradartask;

/**
 *
 * @author doksh
 */
public class SpeedTrafficViolation implements TrafficViolation{
    private int fineAmount = 300;

    @Override
    public boolean isViolationDone(CarInterface car) {
        if(car.getSpeed() > car.getMaxSpeed()){
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
        return "- Speed of " + car.getSpeed() + " exceeded max allowed " + car.getMaxSpeed() +": " + getFineAmount() + " EGP"; 
    }
    
}
