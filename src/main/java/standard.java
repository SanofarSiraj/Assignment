public class standard extends Rooms{





    public standard ( int roomNumber,String roomName, String RoomDimension, String Description,boolean Roomavailability,int Roomquantity) {
            this.roomName = roomName;
            this.RoomDimension = RoomDimension;
            this.Description = Description;
            this.Roomavailability=Roomavailability;
            //this.guest = Guest;
        this.Roomquantity=Roomquantity;
        this.RoomNumber=roomNumber;

        }

        public void describe(){
            System.out.println(this.Description);
        }


}

