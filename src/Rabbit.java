public class Rabbit extends Animal {
    private int shitCounter;

    public Rabbit(int shits, double removeTime, int shitCount) {
        super(shits, removeTime, shitCount);
    }


    public int getShitCounter() {
        return shitCounter;
    }

    public void setShitCounter(int shitCounter) {
        this.shitCounter = shitCounter;
    }
}
