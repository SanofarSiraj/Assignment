public class suite extends Rooms {
    public suite (int RoomNumber, String RoomDimension, String Description,boolean Roomavailability) {
        this.RoomNumber = RoomNumber;
        this.RoomDimension = RoomDimension;
        this.Description = Description;
        this.Roomavailability=Roomavailability;


    }
    public suite (int RoomNumber, String RoomDimension, String Description,boolean Roomavailability,Animals Guest) {
        this.RoomNumber = RoomNumber;
        this.RoomDimension = RoomDimension;
        this.Description = Description;
        this.Roomavailability=Roomavailability;
        this.guest = Guest;

    }
}
