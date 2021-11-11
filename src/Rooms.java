public class Rooms {

    int RoomNumber;
    String RoomDimension;
    String Description;
    boolean Roomavailability;
    Animals guest;
    int Roomquantity;
    String roomName;




    public Rooms(int roomNumber,String roomName ,String RoomDimension, String Description,boolean Roomavailability,int Roomquantity) {
        this.RoomNumber = roomNumber;
        this.roomName = roomName;
        this.RoomDimension = RoomDimension;
        this.Description = Description;
        this.Roomavailability=Roomavailability;
        this.Roomquantity=Roomquantity;


    }


    public Rooms() {

    }

    public void setRoomNumber(int RN) {
        this.RoomNumber = RN;

    }

    public String getRoomName(){
        return roomName;
    }

    public void setRoomDimension(String RD) {
        this.RoomDimension = RD;

    }

    public void setDescription(String D) {
        this.Description = D;

    }

    public void setRoomavailability(Boolean RA) {
        this.Roomavailability = RA;

    }

    //public void setGuest(Animals NewGuest) {
        //guest=NewGuest;
    //}

    public void setRoomquantity(int Roomquantity) {
        this.Roomquantity=Roomquantity;
    }


    public int getRoomNumber() {
        return RoomNumber;
    }

    public String getRoomDimension() {
        return RoomDimension;
    }

    public String getDescription() {
        return Description;
    }

    public Boolean getRoomavailability(Boolean RA) {
       return Roomavailability;

    }

    //public Animals getGuest() {
        //return guest;
    //}

    public int getRoomquantity() {
        return Roomquantity;
    }

    public void describe(){
        System.out.println("Welcome to Animal hotel");
        System.out.println("The Animal hotel has three different room categories." +
                "It has good ventilation and sufficient space for the animals to play.");
        System.out.println("1.Standard");
        System.out.println("2.Classic");
        System.out.println("3.Suite");
    }

}



