import java.util.Random;

public class GuestFactory {

    public Guest GenerateGuest(){
        Guest guest = new Guest(RandomizedVisitingTime());
        return guest;
    }
    public int RandomizedVisitingTime()
    {
        int max = 180;
        Random rnd = new Random();
        int visitingtime = rnd.nextInt(max);
        return  visitingtime;

    }
}
