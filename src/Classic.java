public class Classic extends Rooms {

    public Classic (int RoomNumber, String RoomDimension, String Description,boolean Roomavailability) {
        this.RoomNumber = RoomNumber;
        this.RoomDimension = RoomDimension;
        this.Description = Description;
        this.Roomavailability=Roomavailability;


    }
    public Classic (int RoomNumber, String RoomDimension, String Description,boolean Roomavailability,Animals Guest) {
        this.RoomNumber = RoomNumber;
        this.RoomDimension = RoomDimension;
        this.Description = Description;
        this.Roomavailability=Roomavailability;
        this.guest = Guest;

    }
}
