/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fawryradartask;

/**
 *
 * @author doksh
 */
public interface TrafficViolation {
    boolean isViolationDone(CarInterface car);
    int getFineAmount();
    String getDescription(CarInterface car);
    String getViolationName();  
    int getViolationsCount();
}
