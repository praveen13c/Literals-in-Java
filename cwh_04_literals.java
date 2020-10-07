package com.company;

public class cwh_04_literals {
    public static void main(String[] args) {
        // a constant value which can be  assigned to the variable is called as a literal

        char psc = 'P'; // we dont need to put any latters at the end of value
        byte ageByte = 34;
        int ageInt = 35;
        short ageShort = 36;

        float fl = 10.02f;  // we have to put f at the end of value so that it will be cas float
        long ageLong = 566565656l; // we can put L or l
        System.out.println(ageLong);  // println gives a new line
        System.out.print(fl); // we wont get a new line , it will be inline after this line

        double dl = 4.66D;  // we can or we dont put D or d , its default double
        double dbl = 8.23;
        double dll = 6.44d;
        System.out.println(dl+ ' '+  dbl+ ' '+ dll);

        boolean a = true;

        String s = "Praveen Singh Chauhan";
        System.out.println(s +  " is "  + a); // if we use println then we get a new line
    }
}
