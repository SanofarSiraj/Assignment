public class Classic extends Rooms {


    public Classic (int roomNumber,String roomName, String RoomDimension, String Description,boolean Roomavailability,int Roomquantity) {
        this.roomName = roomName;
        this.RoomDimension = RoomDimension;
        this.Description = Description;
        this.Roomavailability=Roomavailability;
        this.Roomquantity=Roomquantity;
        this.RoomNumber=roomNumber;

    }
    public void describe(){

        System.out.println(this.Description);
    }
}
