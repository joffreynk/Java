/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carService.center;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jess
 * this class is used  for our clients to supply them our services which we have in our services class
 */
public class CarOwner {

    private ArrayList<String>client=new ArrayList<>();
    private ArrayList<String>takenTime=new ArrayList<>();
    services serviceObject=new services();
    private String name;

    public CarOwner(String name) {
        this.name = name;
    }
    
    public boolean addServiceToClient(String ServiceName){
        if(serviceObject.findService(ServiceName)==ServiceName){
            int index=client.indexOf(ServiceName);
            if(index<0){
        this.client.add(ServiceName);
        Date datetemp=new Date(System.currentTimeMillis());
        SimpleDateFormat sdf= new SimpleDateFormat();
        String dateTaken=sdf.format(datetemp);
        this.takenTime.add(dateTaken);
        return true;
            }else{
                System.out.println(ServiceName+" already taken by "+name);
                
            }
        
       return true;
        }else{
            System.err.println("you asked us a service: "+ServiceName+", which we don't have");
            return false;
        }
        }
    public boolean printTakenServices(){
        if(!client.isEmpty()){
            System.out.println(name+" took the folowing service(s):");
            double total=0;
        for(int i=0;i<client.size();i++){
            String servicerequest=client.get(i);
            String datetime=takenTime.get(i);
            
            
            ArrayList<String >service=serviceObject.getService();
            ArrayList<Double>cost=serviceObject.getCost();
            
            for(int j=0;j<service.size();j++){
                if(servicerequest==service.get(j)){
                    double amount=cost.get(j);
                    System.out.print("Service "+servicerequest+" cost: $"+amount);
                    System.out.print("  on "+datetime+"\n");
                    total+=amount;
                }
            }
            

        }
            System.out.println("\t\t _______");
        System.out.println(name+ " took services cost: $"+total);
        return true;
        }else{
            System.out.println("you didn't supply any service");
            return false;
        }
        
    }
        
}