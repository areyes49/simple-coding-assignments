package com.java24hours;

public class Modem { 
    int speed;
    String method;
    
    public void displaySpeed() {
        System.out.println("Speed:" + speed);
        
    
    }
    
    public void disconnect() {
        System.out.println("Disconnecting from " + method);
    }
}
