package com.java24hours;

class SpaceRemover {
    
    public static void main(String[] args) {
        String mostfamous = "Rudolph the Red- Nosed reindeer";
        char[] m1 = mostfamous.toCharArray();
        for (int i = 0; i < m1.length; i++) {
            char current = m1[i];
            if (current !=' ') {
                System.out.print(current);
               
            } else {
                System.out.print('.');
            }
        }
        System.out.println();
    }
}
