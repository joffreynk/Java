/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carService.center;

/**
 *
 * @author Jess
 */
public class CAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        services service= new services();
        //s.ourServices();
        service.printServicesAndTheirCost();
        System.out.println("==================");
        
        CarOwner Faiq=new CarOwner("Faiq");
        Faiq.addServiceToClient("Basic Inspection");
        Faiq.addServiceToClient("Tire Rotation");
        Faiq.addServiceToClient("Oil Change");
        Faiq.printTakenServices();
        
        System.out.println("==================");
        CarOwner Eshaan=new CarOwner("Eshaan");
        Eshaan.addServiceToClient("Oil Change");
        
        System.out.println("==================");
        CarOwner Aliu=new CarOwner("Aliu");
        Aliu.addServiceToClient("Tire Rotation");
        Aliu.printTakenServices();
        

        
    }
    
}
