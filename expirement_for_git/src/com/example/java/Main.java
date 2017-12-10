package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int age, number;
        String university;
        String city;
        String smth;
        System.out.println("Print your ag");
        age=sc.nextInt();


        sc.nextLine();
        System.out.println("Print your university");
        university=sc.nextLine();

        System.out.println("Print your city");
        city=sc.next();

        System.out.println("Your age is "+age+". Your university is "+university+". Your city is "+city);
    }
}
