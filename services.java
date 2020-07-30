/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carService.center;

import java.util.ArrayList;

/**
 *
 * @author Jess
 * this class is used to control services u can add, remove and display services
 */
public class services {
    ArrayList<String>service=new ArrayList<>();
    ArrayList<Double>cost=new ArrayList<>();

    public services() {
        this.cost=new ArrayList<>();
        this.service= new ArrayList<>();
        ourServices();
    }
    

    public void ourServices() {
        addService("Basic Inspection", 50);
        addService("Oil Change", 85);
        addService("Tire Rotation", 23.5); 
    }

   
    public void addService(String service, double cost){
        String check=findService(service);
        if(check==null){
            this.cost.add(cost);
            this.service.add(service);
            
        }else {
            System.out.println("service you are trying to addd alread exist");
            
        }
        
    }
    
    
    public boolean removeService(String serviceR){
        String check=findService(serviceR);
        if(check!=null){
            int indexS=this.service.indexOf(check);
            this.service.remove(indexS);
            this.cost.remove(indexS);
            return true;
        }else {
            System.out.println("service you are trying to remove is not exist");
            return false;
        }
    }
    
    public boolean printServicesAndTheirCost(){
        if(!service.isEmpty()){
            System.out.println("Our services are:\n");
            for(int i=0;i<service.size()&&i<cost.size();i++){
                String servicef=service.get(i);
                //String servicename=servcef.
                double costf=cost.get(i);
                System.out.println("service: "+servicef+" cost: $"+costf);
            }
            return true;
        }else{
            System.out.println("you dont have any service");
            return false;
        }
        
    }
    

    public String findService(String servicesearch) {
       int index=service.indexOf(servicesearch);
       if(index>=0){
           String searched=service.get(index);
           return searched;
       }
       return null;
    }
    public ArrayList<String> getService() {
        return service;
    }

    public ArrayList<Double> getCost() {
        return cost;
    }

    
}
