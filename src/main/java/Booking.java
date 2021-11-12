import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;
// Menu, Description, choices, questions, Edits,

public class Booking {//All information about rooms, objects for the diff rooms linked to check availability.
    ArrayList<Animals> Bookingdetails = new ArrayList<Animals>();
    ArrayList<Rooms> Roomsarray = new ArrayList<Rooms>();
    HashMap<Integer, String> roomAlloc;//Hash map to link room no and type.
    int typeOfAnimal;
    String Name1 = null;
    int age;
    String sex = null;
    String Favorite_food = null;
    String Favorite_activity = null;
    String roomType = null;
    String typeOfAnimal1 = null;
    Rooms myobj0;
    Rooms myobj1;
    Rooms myobj2;
    Animals Animal1;


    public Booking() {

        myobj0 = new standard(101,"Standard", "50sqm", "Its a dark room and has a king size bed.", true, 1);
        myobj1 = new Classic(201,"Classic", "70sqm", "Its a bright room and has a queen size bed.", true, 1);
        myobj2 = new suite(301,"Suite", "100sqm", "Its a large room and has a wide space .", true, 1);
        Roomsarray.add(myobj0);
        Roomsarray.add(myobj1);
        Roomsarray.add(myobj2);
        roomAlloc = new HashMap<>();
        roomAlloc.put(101, "Standard");
        roomAlloc.put(201, "Classic");
        roomAlloc.put(301, "Suite");
    }

    public void menu() { // different menu choices for user input.
        boolean programRunning = true;
        while (programRunning) {

            System.out.println("*****Welcome to Animal Hotel*****");
            System.out.println("1. Booking info and Check In");
            System.out.println("2. Check Out");
            System.out.println("3. Booking Information");
            System.out.println("4. Change Reservation");
            System.out.println("5. Room Description");
            System.out.println("6. Search Booking");
            System.out.println("7.Filter Booking");
            System.out.println("8. ***** Exit *****");

            int menuChoice;
            menuChoice = getUserInt();
            switch (menuChoice) { // we call different methods through switch case.
                case 1 -> {
                    System.out.println("New Booking");
                    bookingInfo();
                    break;
                }
                case 2 -> {
                    System.out.println("Check Out");
                    checkOut();
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
                case 6 -> {
                    System.out.println("Enter name to search for:");
                    String searchBookingName = getUserString();
                    bookingUserInformation(searchBookingName);
                    break;

                }
                case 7 -> {
                    filterbooking();
                    break;
                }

                case 8 -> {
                    programRunning = false;
                    System.out.println("Exiting Animal Hotel!");
                    break;
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
        } else if (typeOfAnimal == 2) {
            typeOfAnimal1 = "Lion";
            System.out.println(typeOfAnimal1);
        } else if (typeOfAnimal == 3) {
            typeOfAnimal1 = "Cheetah";
            System.out.println(typeOfAnimal1);
        }
        System.out.print("Enter your Name : ");
        Name1 = getUserString();
        System.out.print("Enter your Age :");
        age = getUserInt();
        System.out.print("Enter your Sex :");
        sex = getUserString();
        System.out.print("Enter your Favorite food :");
        Favorite_food = getUserString();
        System.out.print("Enter your Favorite Activity :");
        Favorite_activity = getUserString();
        System.out.println("Choose your room");
        System.out.println("101. Standard");
        System.out.println("201. Classic");
        System.out.println("301. Suite");
        int roomNumber = getUserInt();

        roomReservation(roomNumber);

        System.out.println("Allocated room for " + typeOfAnimal1 + "----->" + Name1 + " is : " + roomType);

        confirmRoomReservation(Name1, roomType);
    }

    private void confirmRoomReservation(String Name, String roomType) { // This method is used to check the availability of room and store the booking details.
        for (int i = 0; i < Roomsarray.size(); i++) {
            if (Roomsarray.get(i).roomName.equals(roomType)) {
                if (Roomsarray.get(i).Roomquantity > 0) {
                    Animal1 = new Animals(Name, age, sex, Favorite_food, Favorite_activity);
                    Animal1.setRoomType(roomType);
                    Bookingdetails.add(Animal1);
                    System.out.println("The room is available");
                    Roomsarray.get(i).Roomquantity = Roomsarray.get(i).Roomquantity - 1;
                    break;
                }
            } else if (i >= Roomsarray.size() - 1) {
                System.out.println("The room is not available");
            }
        }
    }

    private void Information() { // This method is used to view the entire booking list.

        System.out.println("Your booking details will be listed below");
        for (int i = 0; i < Bookingdetails.size(); i++) {
            System.out.println(Bookingdetails.get(i).getName());

            System.out.println("Name :" + Bookingdetails.get(i).getName() + "Age :" + Bookingdetails.get(i).getAge() +
                    "Sex :" + Bookingdetails.get(i).getSex() +
                    "Favorite_Food : " + Bookingdetails.get(i).getFavorite_food() + "\n" +
                    "Favorite_Activity : " + Bookingdetails.get(i).getFavorite_Activity() +  "\n" +  "Room category :"
                    + Bookingdetails.get(i).getRoomType());

        }
    }

    public void filterbooking() { // This method is used to search booking by single string.
        System.out.println("Enter the letter to filter from booking details");
        String S = getUserString();
        for (int i = 0; i < Bookingdetails.size(); i++) {
            if (Bookingdetails.get(i).getName().contains(S)) {
                System.out.println("Animal name :" + Bookingdetails.get(i).getName());
            }

        }

    }

    public Animals bookingUserInformation(String bookingName) { // This method is used to filter by name.
        for (int i = 0; i < Bookingdetails.size(); i++) {
            if (Bookingdetails.get(i).getName().equals(bookingName)) {
                System.out.println("Name :" + Bookingdetails.get(i).getName() + "Age :" + Bookingdetails.get(i).getAge()
                        + "Sex :" + Bookingdetails.get(i).getSex() + "\n" + "\n" +
                        "Favorite_Food : " + Bookingdetails.get(i).getFavorite_food() + "\n"
                        + "Favorite_Activity : " + Bookingdetails.get(i).getFavorite_Activity());
                return Bookingdetails.get(i);
            }
        }
        return null;

    }

    private void editBookingDetails(String name, String foodUpdate, String activity, Animals animalBookingDetails) {
        animalBookingDetails.setFavorite_Activity(activity);
        Animal1 = new Animals(name, animalBookingDetails.getAge(), animalBookingDetails.getSex(),
                foodUpdate, activity);
        Animal1.setRoomType(animalBookingDetails.getRoomType());
        Bookingdetails.removeIf(a -> a.getName().equals(animalBookingDetails.getName()));
        Bookingdetails.add(Animal1);


    }

    private void changeReservation() {
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
        editBookingDetails(name, foodUpdate, activityUpdate, animalDetails);
    }

    private void checkOut() {
        System.out.println("Enter your Booking name :");
        String bookingName = getUserString();
        Bookingdetails.removeIf(a -> a.getName().equals(bookingName));
        System.out.println(bookingName + " have been checked out");
    }

    private void roomReservation(int roomNum) {
        for (Map.Entry<Integer, String> set ://key,value
                roomAlloc.entrySet()) {

            // Printing all elements of a Map
            System.out.println(set.getKey() + " = "
                    + set.getValue());

            if (roomNum == set.getKey())
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

    public void description() {
        System.out.println("Choose the room to describe");
        System.out.println("1. Standard Room");
        System.out.println("2. Classic Room");
        System.out.println("3. Suite room");
        int menuchoice = getUserInt();
        if (menuchoice == 1) {
            myobj0.describe();
        } else if (menuchoice == 2) {
            myobj1.describe();
        } else if (menuchoice == 3) {
            myobj2.describe();
        }
    }
}




















