/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author alexs
 */
public class Car {
    
    int maxspeed = 100;
    int minspeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    
    public void printVariables() {
        System.out.println("This is the max speed " + maxspeed);
        System.out.println(minspeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }
     public void upgradeMinSpeed() {
         minspeed = maxspeed;
         maxspeed = maxspeed + 1;
     }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car familycar = new Car();
        System.out.println("Family's Car:");
        familycar.printVariables();
        familycar.upgradeMinSpeed();
        familycar.printVariables();

    }
    
}
