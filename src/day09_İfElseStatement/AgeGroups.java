package day09_İfElseStatement;

import java.sql.SQLOutput;

public class AgeGroups {

    public static void main(String[] args) {
        int age =86;
        if(age<=2){
            System.out.println("infant");
        } else if (age<=5 && age>=2) {
            System.out.println("Toddler");
        } else if (age<=9 && age>=6){
            System.out.println("Kid");
        } else if (age<=12 && age>=10) {
            System.out.println("Pre -Teen");
        } else if (age<=17&& age>=13) {
            System.out.println("Teenager");
        } else if (age<=20 && age>=18) {
            System.out.println("Young Adult");
        } else if (age<=39 && age>=21) {
            System.out.println("Adult");
        } else if (age<=49 && age>=40) {
            System.out.println("Young Middle-Aged Adult");
        } else if (age<=54 && age>=50) {
            System.out.println("Middle-Aged Adult");
        } else if (age<=64 && age>=55) {
            System.out.println("Very Young Senior Citizen");
        } else if (age<=74 && age>=65) {
            System.out.println("Young Senior Citizen");
        } else if (age<=84 && age>=75) {
            System.out.println("Senior Citizen");
        }else
            System.out.println("Old Senior Citizen");


    }







}
/*
5. Create a class called AgeGroups, and write a program that can define the age groups of a person
	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */