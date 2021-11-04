public class Animals {
 // Name, age, size

    String Name;
    int Age;
    String Sex;
public Animals(){
}


    public Animals(String Name,int Age,String Sex) {
        this.Name=Name;
        this.Age=Age;
        this.Sex=Sex;

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
    public String getName()
    {
        return Name;
    }
    public int getAge()
    {
        return Age;
    }
    public String getSex()
    {
        return Sex;
    }
    }
