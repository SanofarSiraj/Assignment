public class Tiger extends Animals {
    //Inherit Animals, new food and activity

    String Favorite_food;
    String Favorite_Activity;

    public Tiger(String Name,int Age,String Sex,String Favorite_Activity,String Favorite_Food){
        this.Favorite_Activity=Favorite_Activity;
        this.Favorite_food=Favorite_food;
        this.Name=Name;
        this.Age=Age;
        this.Sex=Sex;
    }

    public void setFavorite_food(String F){
        this.Favorite_food= F;

    }

    public void setFavorite_Activity(String FA){
        this.Favorite_Activity= FA;

    }

    public String getFavorite_food()
    {
        return Favorite_food;
    }
    public String getFavorite_Activity()
    {
        return Favorite_Activity;
    }

}
