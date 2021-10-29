public class Rooms {

    int RoomNumber;
    String RoomDimension;
    String Description;


    public Rooms(int RoomNumber, String RoomDimension, String Description) {
        this.RoomNumber = RoomNumber;
        this.RoomDimension = RoomDimension;
        this.Description = Description;

    }

    public Rooms() {

    }

    public void setRoomNumber(int RN) {
        this.RoomNumber = RN;

    }

    public void setRoomDimension(String RD) {
        this.RoomDimension = RD;

    }

    public void Description(String D) {
        this.Description = D;

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
}



