package com.java24hours;

class Credits   {
    public static void main(String[] args)  {
        String title = "Sharknado";
        
        int year = 2013;
        String director = "Anthony Ferrante";
        String role1 = "Fin";
        String actor1 = "Ian Ziering";
        String role2 = "April";
        String actor2 = "Tara reid";
        String role3 = "George";
        String actor3 = "John Heard";
        String role4 = "Nova";
        String actor4 = "Cassie Scerbo";
        
        System.out.println(title + "("+year+") \n"
        + "A " + director.toUpperCase() + " film.\n\n"+
        role1.toUpperCase() + "\t" + actor1 + "\n" + 
        role2.toUpperCase() + "\t" + actor2 + "\n" + 
        role3.toUpperCase() + "\t" + actor3 + "\n" + 
        role4.toUpperCase() + "\t" + actor4);
       
                
        
    }
}
