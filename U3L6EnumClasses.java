//Malia Moreno | 7 October 2024//
package com.mycompany.u3l6enumclasses;
import java.util.Scanner;

public class U3L6EnumClasses {
    public static void main(String[] args) {
        //Write a main methong that creats and enum for days of the week
        //then print them all out and print out the number of the week (not ordinals)
        enum weekDays {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}  //defining enum class//
        System.out.println("Day of the week: "+weekDays.Sunday.name()+"\t\tNumber of the day: "+(weekDays.Sunday.ordinal()+1));
        System.out.println("Day of the week: "+weekDays.Monday.name()+"\t\tNumber of the day: "+(weekDays.Monday.ordinal()+1));
        System.out.println("Day of the week: "+weekDays.Tuesday.name()+"\tNumber of the day: "+(weekDays.Tuesday.ordinal()+1));
        System.out.println("Day of the week: "+weekDays.Wednesday.name()+"\tNumber of the day: "+(weekDays.Wednesday.ordinal()+1));
        System.out.println("Day of the week: "+weekDays.Thursday.name()+"\tNumber of the day: "+(weekDays.Thursday.ordinal()+1));
        System.out.println("Day of the week: "+weekDays.Friday.name()+"\t\tNumber of the day: "+(weekDays.Friday.ordinal()+1));
        System.out.println("Day of the week: "+weekDays.Saturday.name()+"\tNumber of the day: "+(weekDays.Saturday.ordinal()+1));
        
        //Write a main method creating an enum for months of the year
        //then print them out plys month in the year number
        enum months {Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec}    //defining enum class//
        System.out.println("\n\nMonth: "+months.Jan.name()+"\tMonth Number of the year: "+(months.Jan.ordinal()+1));
        System.out.println("Month: "+months.Feb.name()+"\tMonth Number of the year: "+(months.Feb.ordinal()+1));
        System.out.println("Month: "+months.Mar.name()+"\tMonth Number of the year: "+(months.Mar.ordinal()+1));
        System.out.println("Month: "+months.Apr.name()+"\tMonth Number of the year: "+(months.Apr.ordinal()+1));
        System.out.println("Month: "+months.May.name()+"\tMonth Number of the year: "+(months.May.ordinal()+1));
        System.out.println("Month: "+months.Jun.name()+"\tMonth Number of the year: "+(months.Jun.ordinal()+1));
        System.out.println("Month: "+months.Jul.name()+"\tMonth Number of the year: "+(months.Jul.ordinal()+1));
        System.out.println("Month: "+months.Aug.name()+"\tMonth Number of the year: "+(months.Aug.ordinal()+1));
        System.out.println("Month: "+months.Sep.name()+"\tMonth Number of the year: "+(months.Sep.ordinal()+1));
        System.out.println("Month: "+months.Oct.name()+"\tMonth Number of the year: "+(months.Oct.ordinal()+1));
        System.out.println("Month: "+months.Nov.name()+"\tMonth Number of the year: "+(months.Nov.ordinal()+1));
        System.out.println("Month: "+months.Dec.name()+"\tMonth Number of the year: "+(months.Dec.ordinal()+1));
        
        //write a main method asking for your cchs username (including graduation year)
        //must make string for username, recall all years have a length of 4, use int object to parse int valu of string
        //have method pring graduation year and year after graduation
        //Also print "In computer language, you graduate in: " and the bianry of string version of graduation year
        Scanner scan = new Scanner(System.in);      //create scanner//
        System.out.print("\n\nWhat is your CCHS username:\t");
        String schoolUser = scan.next();        //get username from user//
        String gradYear = schoolUser.substring(schoolUser.length()-4, schoolUser.length());     //get graduation year at the end of username, last 4 places//
        Integer gradYearInt = Integer.parseInt(gradYear);       //conver graduation year from string to integer//
        
        System.out.println("You will graduate in: "+gradYearInt+" and the year after that will be: "+(gradYearInt+1));
        System.out.println("In computer language, you graduate in: "+Integer.toBinaryString(gradYearInt));      //convert integer to bionary//
    }
}
