

import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
// Menu, Description, choices, questions, Edits,

public class Booking extends Animals {
    ArrayList<Animals> Bookingdetails = new ArrayList<Animals>();
    ArrayList<String> Myarray = new ArrayList<String>();


    Animals myobj3;
    Animals myobj4;
    Animals myobj5;
    Rooms myobj0;
    Rooms myobj1;
    Rooms myobj2;

    public Booking() {
        myobj0 = new Rooms(1, "50sqm", "Its a dark room and has a king size bed.");
        myobj1 = new Rooms(2, "70sqm", "Its a bright room and has a queen size bed.");
        myobj2 = new Rooms(3, "100sqm", "Its a large room and has a wide space .");
        myobj3 = new Animals("Tiger", 7, "M");
        myobj4 = new Animals("Lion", 10, "F");
        myobj5 = new Animals("Cheetah", 13, "M");

        menu();
        new Rooms();
    }

    public void menu() {

        boolean programRunning = true;
        while (programRunning = true) {

            System.out.println("*****Welcome to Animal Hotel*****");
            System.out.println("1.Booking info and Check In");
            System.out.println("2.Check Out");
            System.out.println("3.Information");
            System.out.println("4.Change Reservation");
            System.out.println("***** Exit *****");

            int menuChoice;
            menuChoice = getUserInt();


            switch (menuChoice) {
                case 1 -> {
                    System.out.println("New Booking");
                    bookingInfo();
                    break;
                }

                case 2 -> {
                    System.out.println("Check Out");
                    CheckOut();
                    break;
                }
                case 3 -> {
                    System.out.println("Information");
                    new Rooms();
                    break;
                }

                case 4 -> {
                    System.out.println("Change Reservation");
                    break;
                }
                case 5 -> {
                    programRunning = false;
                    System.out.println("Exiting Animal Hotel!");
                    break;
                }

            }
        }
    }


    public void bookingInfo() {
        System.out.println("Enter your Name");
        String name = getUserString();
        System.out.println("Enter your Age");
        int age = getUserInt();
        System.out.println("Enter your Sex");
        String sex = getUserString();
        System.out.println("Enter your Favorite food");
        String Favorite_food = getUserString();
        System.out.println("Enter your Favorite Activity");
        String Favorite_activity = getUserString();
        System.out.println("Choose the type of room");
        System.out.println("1. Standard");
        System.out.println("2. Classic");
        System.out.println("3. Suit");
        int menu = getUserInt();
        boolean programRunning = true;
        if (menu == 1) {
            System.out.println("Standard room Choosen");
            System.out.println(myobj0);

        }
        if (menu == 2) {
            System.out.println("Classic room Choosen");
            System.out.println(myobj1);
        }
        if (menu == 3) {
            System.out.println("Suite room Choosen");
            System.out.println(myobj2);

        }
        /*switch(menu){
            case 1 -> {
                System.out.println("Standard room Choosen");
                HotellRooms();
                System.out.println("You are now booked in a Standard room");

                break;
            }
            case 2 -> {
                System.out.println("Classic room Choosen");
                HotellRooms();
                System.out.println("You are now booked in a Classic room");
                break;
            }
            case 3 -> {
                System.out.println("Suite room Choosen");
                HotellRooms();
                System.out.println("You are now booked in a Suite room");
                break;
            }
        }*/
        System.out.println("Your booking details will be listed below");
        System.out.println(Bookingdetails + "\n" + name + "\n" + age + "\n" + Favorite_food + "\n" + Favorite_activity);


        //if (name.equals("Tiger")){
        Bookingdetails.add(myobj3);
        //}
        //else if (name.equals("Lion")){
        Bookingdetails.add(myobj4);
        //}
        //else if (name.equals("Cheetah")){
        Bookingdetails.add(myobj5);
        //}

        Myarray.add(name);
        System.out.println();
        System.out.println();

        for (int i = 0; i < Myarray.size(); i++) {
            System.out.println(Myarray.get(i));

            if (Myarray.equals(Bookingdetails.get(i))) {
                System.out.println("The room is already booked");
            }
        }
    }


    public void CheckOut() {
        int date;
    }

    public static String getUserString() {
        Scanner getUserString = new Scanner(System.in);
        String userInput = getUserString.nextLine();
        return userInput;
    }

    public static int getUserInt() {
        Scanner getUserInt = new Scanner(System.in);
        int menuChoice = getUserInt.nextInt();
        return menuChoice;
    }

    public void HotellRooms() {


    }
}


















