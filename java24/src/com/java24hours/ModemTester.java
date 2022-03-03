package com.java24hours;

public class ModemTester {
    
   public static void main(String[] args) {
       
       CableModem surfBoard = new CableModem();
       DslModem gateway = new DslModem();
       AcousticModem c = new AcousticModem();
       c.speed = 300;
       surfBoard.speed = 500000;
       gateway.speed = 400000;
       System.out.println("Trying the cable modem:");
       surfBoard.displaySpeed();
       surfBoard.connect();
       surfBoard.disconnect();
       System.out.println("Trying the DSL modem:");
       gateway.displaySpeed();
       gateway.connect();
       gateway.disconnect();
       System.out.println("Trying the Acoustic modem:");
       c.displaySpeed();
       c.connect();
       c.disconnect();
       
   }
}
