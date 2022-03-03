package com.java24hours;

class Game  {

public static void main(String[] args)  {
    
    int total = 0;
    int score = 7;
    if ( score == 7){
        System.out.println("you scored a touchdown!");
        
    }
    
    if (score == 3) {
        System.out.println("You scored a field goal!");
    }
    
    total = total + score;
    System.out.println("total score: " + total);
}

}
