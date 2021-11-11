public class suite extends Rooms {

    public suite (String roomName, String RoomDimension, String Description,boolean Roomavailability,int Roomquantity) {
        this.roomName = roomName;
        this.RoomDimension = RoomDimension;
        this.Description = Description;
        this.Roomavailability=Roomavailability;
        this.Roomquantity=Roomquantity;

    }
    public void describe(){
        System.out.println(this.Description);
    }
}
