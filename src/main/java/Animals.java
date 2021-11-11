public class Animals {
 // Name, age, size

    String Name;
    int Age;
    String Sex;
    String Favorite_food;
    String Favorite_Activity;
    String roomType;

public Animals(){
}


    public Animals(String Name,int Age,String Sex,String Favorite_food,String Favorite_Activity) {
        this.Name=Name;
        this.Age=Age;
        this.Sex=Sex;
        this.Favorite_food=Favorite_food;
        this.Favorite_Activity=Favorite_Activity;

    }

    public void setName(String N){
        this.Name= N;

    }
    public void setAge(int A){
        this.Age= A;

    }

    public void setsize(String s){
        this.Sex= s;

    }

    public void setFavorite_food(String FF){
        this.Favorite_food= FF;

    }

    public void setFavorite_Activity(String FA){
        this.Favorite_food= FA;

    }

    public void setRoomType(String roomType){
       this.roomType = roomType;
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
    public String getSex() {
        return Sex;
    }
    public String getFavorite_food() {
        return Favorite_food;
    }
    public String getFavorite_Activity() {
        return Favorite_Activity;
    }
    public String getRoomType(){
        return roomType;
    }
    }
