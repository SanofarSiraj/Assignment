

import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
// Menu, Description, choices, questions, Edits,

public class Booking {
    ArrayList<Animals> Bookingdetails = new ArrayList<Animals>();
    ArrayList<String> Myarray = new ArrayList<String>();
    ArrayList<Rooms> Roomsarray = new ArrayList<Rooms>();



    Rooms myobj0;
    Rooms myobj1;
    Rooms myobj2;

    public Booking() {

        myobj0 = new Rooms(1, "50sqm", "Its a dark room and has a king size bed.", true);
        myobj1 = new Rooms(2, "70sqm", "Its a bright room and has a queen size bed.", true);
        myobj2 = new Rooms(3, "100sqm", "Its a large room and has a wide space .", true);
        Animal1=new Tiger("Tiger",7,"M","e","r");
        Animal2=new Lion("Lion",10,"M","e","d");
        Animal3=new Cheetah("Cheetah",7,"M","r","t");
        Roomsarray.add(myobj0);
        Roomsarray.add(myobj1);
        Roomsarray.add(myobj2);
        Bookingdetails.add(Animal1);
        Bookingdetails.add(Animal2);
        Bookingdetails.add(Animal3);

        System.out.println(Roomsarray.get(0).getRoomNumber());

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
        String name = getUserString().toLowerCase();
        if(name.equals("tiger")){
            Animal1.setName(name);
        }
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

       /* for (int i = 0; i < Bookingdetails.size(); i++) {
            if (Roomsarray.get(i).getGuest().getName().equals(name)) {
                System.out.println("The room is already booked");

            }*/

                if(menu==1){
                    Roomsarray.get(0).setGuest(Animal1);
                    Roomsarray.get(0).getGuest().getName();
                    System.out.println("Room no:"+Roomsarray.get(0).getRoomNumber()+"guestname"+Roomsarray.get(0).getGuest().getName());
                }












            //Bookingdetails.get(0).setName(name);



        /*


                //}

            }
            else{


               // boolean programRunning = true;
                Myarray.add(name);
                System.out.println();
                System.out.println();
                if (menu == 1) {
                    System.out.println("Standard room Choosen");
                    System.out.println("Room number : " + myobj0.getRoomNumber());
                    Roomsarray.add(myobj0);

                }
                else if (menu == 2) {
                    System.out.println("Classic room Choosen");
                    System.out.println("Room number : " + myobj1.getRoomNumber());
                    Roomsarray.get(1).getGuest().setName(name);
                }
                else if (menu == 3) {
                    System.out.println("Suite room Choosen");
                    System.out.println("Room number : " + myobj2.getRoomNumber());
                    Roomsarray.get(2).getGuest().setName(name);
                }


            }


        }*/
            System.out.println("Your booking details will be listed below");
        System.out.println(Bookingdetails + "\n" + name + "\n" + age + "\n" + Favorite_food + "\n" + Favorite_activity);






    }


        public static String getUserString() {
            String userInput;

            Scanner getUserString1 = new Scanner(System.in);
             userInput = getUserString1.nextLine();
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


















