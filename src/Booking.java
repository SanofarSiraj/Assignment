

import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;
// Menu, Description, choices, questions, Edits,

public class Booking {
    ArrayList<Animals> Bookingdetails = new ArrayList<Animals>();
    ArrayList<Rooms> Roomsarray = new ArrayList<Rooms>();
    HashMap<Integer,String> roomAlloc;
    int typeOfAnimal;
    int Name;
    String Name1 = null;
    int age;
    String sex = null ;
    String Favorite_food = null ;
    String Favorite_activity = null ;
    String roomType=null;
    String typeOfAnimal1 = null;
    Rooms myobj0;
    Rooms myobj1;
    Rooms myobj2;
    Animals Animal1;


    public Booking() {

        myobj0 = new standard("Standard", "50sqm", "Its a dark room and has a king size bed.", true,1);
        myobj1 = new Classic("Classic", "70sqm", "Its a bright room and has a queen size bed.", true,1);
        myobj2 = new suite("Suite", "100sqm", "Its a large room and has a wide space .", true,1);
        Roomsarray.add(myobj0);
        Roomsarray.add(myobj1);
        Roomsarray.add(myobj2);
        roomAlloc = new HashMap<>();
        roomAlloc.put(101, "Standard");
        roomAlloc.put(201, "Classic");
        roomAlloc.put(301, "Suite");
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
                    Information();
                    break;
                }

                case 4 -> {
                    System.out.println("Change Reservation");
                    changeReservation();
                    break;
                }
                case 5 -> {
                    System.out.println("Room Description");
                    description();
                }
                case 7 -> {
                    programRunning = false;
                    System.out.println("Exiting Animal Hotel!");
                    break;
                }
                case 6 -> {
                    System.out.println("Enter name to search for:");
                   String searchBookingName =  getUserString();
                   bookingUserInformation(searchBookingName);

                }
            }
        }
    }

    public void bookingInfo() {

        System.out.println("Choose Animal");

        System.out.println("1.Tiger");
        System.out.println("2.Lion");
        System.out.println("3.Cheetah");
        typeOfAnimal = getUserInt();
        if (typeOfAnimal == 1) {
             typeOfAnimal1 = "Tiger";
            System.out.println(typeOfAnimal1);
        }
        else if (typeOfAnimal == 2) {
            typeOfAnimal1 ="Lion";
            System.out.println(typeOfAnimal1);
        }
        else if (typeOfAnimal == 3) {
            typeOfAnimal1="Cheetah";
            System.out.println(typeOfAnimal1);
        }
        System.out.println("Enter your Name");
        Name1 = getUserString();
        System.out.println("Enter your Age");
        age = getUserInt();
        System.out.println("Enter your Sex");
        sex = getUserString();
        System.out.println("Enter your Favorite food");
        Favorite_food = getUserString();
        System.out.println("Enter your Favorite Activity");
        Favorite_activity = getUserString();
        System.out.println("Choose your room");
        System.out.println("101. Standard");
        System.out.println("201. Classic");
        System.out.println("301. Suite");
        int roomNumber = getUserInt();

        roomReservation(roomNumber);

        System.out.println("Allocated room for " + typeOfAnimal + Name1 + " is : " + roomType);

        confirmRoomReservation(Name1,roomType); // Animals
    }
    private void confirmRoomReservation(String Name,String roomType){ // Animals a
         for (int i = 0; i < Roomsarray.size(); i++) {
        if(Roomsarray.get(i).roomName.equals(roomType)){
            if(Roomsarray.get(i).Roomquantity>0){
                Animal1 = new Animals(Name, age, sex, Favorite_food, Favorite_activity);
                Animal1.setRoomType(roomType);
                Bookingdetails.add(Animal1);
                System.out.println("The room is available");
                Roomsarray.get(i).Roomquantity = Roomsarray.get(i).Roomquantity-1;
                break;
            } else if(i>= Roomsarray.size()-1) {
                System.out.println("The room is not available");
            }
        } else if(i>= Roomsarray.size()-1) {
            System.out.println("The room is not available");
        }
    }
    }
    private void Information() {

            System.out.println("Your booking details will be listed below");
        for (int i = 0; i < Bookingdetails.size(); i++) {
            System.out.println(Bookingdetails.get(i).getName());

            System.out.println("Name :" + Bookingdetails.get(i).getName() + "Age :" + Bookingdetails.get(i).getAge() +
                    "Sex :" + Bookingdetails.get(i).getSex() +"\n" +  "\n" +
                    "Favorite_Food : " + Bookingdetails.get(i).getFavorite_food() +  "\n" +
                    "Favorite_Activity : "+ Bookingdetails.get(i).getFavorite_Activity() + "Room category :" + Bookingdetails.get(i).getRoomType());

        }

    }

    private Animals bookingUserInformation(String bookingName){
        for(int i = 0; i < Bookingdetails.size() ; i++){
            if(Bookingdetails.get(i).getName().equals(bookingName)){
                System.out.println("Name :" + Bookingdetails.get(i).getName() + "Age :" + Bookingdetails.get(i).getAge() + "Sex :" + Bookingdetails.get(i).getSex() +"\n" +  "\n" +
                        "Favorite_Food : " + Bookingdetails.get(i).getFavorite_food() +  "\n" + "Favorite_Activity : "+ Bookingdetails.get(i).getFavorite_Activity());
                return Bookingdetails.get(i);
            }
        }
        return null;
    }
    private void editBookingDetails(String name , String foodUpdate, String activity, Animals animalBookingDetails){
        animalBookingDetails.setFavorite_Activity(activity);
        Animal1 = new Animals(name, animalBookingDetails.getAge(), animalBookingDetails.getSex(),
                foodUpdate, activity);
        Animal1.setRoomType(animalBookingDetails.getRoomType());
        Bookingdetails.removeIf(a -> a.getName().equals(animalBookingDetails.getName()));
        Bookingdetails.add(Animal1);

    }
    private void changeReservation(){
        System.out.println("Enter your Booking name :");
        String bookingName = getUserString();
        Animals animalDetails = bookingUserInformation(bookingName);
        System.out.println("you can update Name , Food and Activity of your booking :");
        System.out.println("Edit your booking name :");
        String name = getUserString();
        System.out.println("Update your fav food ");
        String foodUpdate = getUserString();
        System.out.println("Update your fav activity :");
        String activityUpdate = getUserString();
        editBookingDetails(name, foodUpdate,activityUpdate,animalDetails);
        animalDetails = bookingUserInformation(bookingName);
        //updateRoomAllocation(animalDetails,bookingName);

    }
    private void checkOut(){
        System.out.println("Enter your Booking name :");
        String bookingName = getUserString();
        Bookingdetails.removeIf(a -> a.getName().equals(bookingName));
        System.out.println(bookingName + " have been checked out");

    }
    private void roomReservation(int roomNum){
        for (Map.Entry<Integer, String> set ://key,value
            roomAlloc.entrySet()) {

        // Printing all elements of a Map
        System.out.println(set.getKey() + " = "
                + set.getValue());

        if(roomNum == set.getKey())
            roomType = set.getValue();

       }
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


















