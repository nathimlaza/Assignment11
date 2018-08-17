package com.company;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int age;
        int appAge;
        String message;
        int difference;
        String evenOdd;

        Scanner sc = new Scanner(System.in);
        message = "enter your name ";
        System.out.print(message);
        name = sc.nextLine();

        Calendar cn = Calendar.getInstance();
        int Day = cn.get(Calendar.AM_PM);
        if (Day != 1) {
            message = "good morning";
            System.out.println(message);

        } else {
            message = "good afternoon";
            System.out.println(message);

        }

        message = "enter your age ";
        System.out.println(message);
        age = sc.nextInt();

        Random generate = new Random();
        appAge = generate.nextInt(90 - 18) + 18;


        // public String diffAge( int appAge; int age;){

        if (age < appAge) {
            difference = appAge-age;
            System.out.println("I am " +difference+" years younger than you");

        } else {
            difference = appAge-age;
            System.out.println("I am "+difference+" years older than you");
        }

        System.out.println("twice my age:" + appAge * 2);


        if (appAge % 2 == 0) {
System.out.println("my age is an even number");
        //evenOdd="even";

        } else {
            //evenOdd="odd";
            System.out.println("my age is an odd number");

        }


System.exit(-1);
    }

}
