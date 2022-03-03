package com.java24hours;

class Grades    {
    
    public static void main(String[] args)  {
         
        int Grade = 100; 
        if (Grade == 100 || Grade >= 90)   {
            System.out.println("Good Job! you have an A!");            
        } else if (Grade <90 && Grade >= 80)   {
            System.out.println("Not Bad! you have a B!");
            
        } else if (Grade <80 && Grade >= 70)    {
            System.out.println("Not Bad. you have a C");
            
        } else if (Grade <70 && Grade >= 60)    {
            System.out.println("Try harder. You have a D");
        } else {
            System.out.println("You have an F");
        }
    }
}
