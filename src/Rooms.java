public class Rooms {

    int RoomNumber;
    String RoomDimension;
    String Description;
    boolean Roomavailability;
    Animals guest;




    public Rooms(int RoomNumber, String RoomDimension, String Description,boolean Roomavailability) {
        this.RoomNumber = RoomNumber;
        this.RoomDimension = RoomDimension;
        this.Description = Description;
        this.Roomavailability=Roomavailability;


    }
    public Rooms(int RoomNumber, String RoomDimension, String Description,boolean Roomavailability,Animals Guest) {
        this.RoomNumber = RoomNumber;
        this.RoomDimension = RoomDimension;
        this.Description = Description;
        this.Roomavailability=Roomavailability;
        this.guest = Guest;

    }


    public Rooms() {

    }

    public void setRoomNumber(int RN) {
        this.RoomNumber = RN;

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

    public void setGuest(Animals NewGuest) {
        guest=NewGuest;
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

    public Animals getGuest() {
        return guest;
    }


}



