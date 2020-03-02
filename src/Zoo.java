import java.util.ArrayList;
import java.util.List;

public class Zoo {
    Animal elephant;
    Animal giraf;
    Animal wolf;
    Animal fox;
    Animal rabbit;

//    Lists
    List<Animal> elephants = new ArrayList<Animal>();
    List<Animal> girafs = new ArrayList<Animal>();
    List<Animal> wolfs = new ArrayList<Animal>();
    List<Animal> foxes = new ArrayList<Animal>();
    List<Animal> rabbits = new ArrayList<Animal>();
    public void ElephantCage()
    {
        int elephantShit = 0;
        for (int i = 0; i < 6; i++) {
            elephant = new Elephant(15, 6, 0);
            elephants.add(elephant);
        }
        for (Animal el: elephants)
        {
            el.TakeShit();
            elephantShit++;
        }
    }
    public void GirafCage()
    {
        int girafShit = 0;
        for (int i = 0; i < 12; i++) {
            giraf = new Giraf(6, 4, 0);
            girafs.add(giraf);
        }
        for (Animal gi: girafs)
        {
            gi.TakeShit();
            girafShit++;
        }
    }
    public void WolfCage()
    {
        int wolfShit = 0;
        for (int i = 0; i < 20; i++) {
            wolf = new Wolf(4,2, 0);
            wolfs.add(wolf);
        }
        for (Animal wo: wolfs)
        {
            wo.TakeShit();
            wolfShit++;
        }
    }
    public void FoxCage()
    {
        int foxShit = 0;
        for (int i = 0; i < 20; i++) {
            fox = new Fox(4,2, 0);
            foxes.add(fox);
        }
        for (Animal fo: foxes)
        {
            fo.TakeShit();
            foxShit++;
        }
    }
    public void RabbitCage()
    {
        int rabbitShit = 0;
        for (int i = 0; i < 10; i++) {
            rabbit = new Rabbit(1,10, 0);
            rabbits.add(rabbit);

        }
        for (Animal ra: rabbits)
        {
            ra.TakeShit();
            rabbitShit++;
        }
    }

}
