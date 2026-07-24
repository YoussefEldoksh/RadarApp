/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fawryradartask;

import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<CarInterface> vehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        trafficRules.add(new SpeedTrafficViolation());
        trafficRules.add(new BeltTrafficViolation());

        Radar radar = new Radar(trafficRules);

        Truck truck1 = new Truck("ABC000", 90, false);
        vehicles.add(truck1);
        Truck truck2 = new Truck("ABC111", 150, true);
        vehicles.add(truck2);
        Truck truck3 = new Truck("ABC222", 80, false);
        vehicles.add(truck3);
        Truck truck4 = new Truck("ABC333", 70, true);
        vehicles.add(truck4);
        Truck truck5 = new Truck("ABC444", 60, false);
        vehicles.add(truck5);

        PrivateCar mycar1 = new PrivateCar("ABC1230", 90, true);
        vehicles.add(mycar1);
        PrivateCar mycar2 = new PrivateCar("ABC1231", 105, false);
        vehicles.add(mycar2);
        PrivateCar mycar3 = new PrivateCar("ABC1232", 60, false);
        vehicles.add(mycar3);
        PrivateCar mycar4 = new PrivateCar("ABC1233", 45, true);
        vehicles.add(mycar4);
        PrivateCar mycar5 = new PrivateCar("ABC1234", 62, true);
        vehicles.add(mycar5);

        for (CarInterface vehicle : vehicles) {
            radar.checkViolation(vehicle);
        }

        while (true) {

            System.out.println("Enter a choice:");
            System.out.println("1- Total fines amount for a car");
            System.out.println("2- Total number per violation ");
            System.out.println("3- Exit");
            
            System.out.println("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice < 1 || choice > 3) {
                System.out.println("Choice Incorrect");
                continue;
            }

            if (choice == 1) {
                System.out.println("Enter plate numbers: ");
                String plateNumbers = scanner.nextLine();

                CarInterface car = null;

                for (CarInterface vehicle : vehicles) {
                    if (vehicle.getPlate().equals(plateNumbers)) {
                        car = vehicle;
                        break;
                    }
                }

                if (car == null) {
                    System.out.println("No vehicle found with that plate.");
                    continue;
                }
                
                System.out.println(car.getTotalFinesFormated());

            } else if (choice == 2) {
                
                for(TrafficViolation rule : trafficRules){
                    System.out.println(rule.getViolationName()+ " : " + rule.getViolationsCount());
                }

            } else {
                break;
            }

        }

    }

}
