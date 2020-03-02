abstract public class Animal {
    private int shitsPerDay;
    private int unhappinessGenerating;
    private double timeToRemoveShit;
    private int currentShitCount;

    public int getShitsPerDay() {
        return shitsPerDay;
    }

    public void setShitsPerDay(int shitsPerDay) {
        this.shitsPerDay = shitsPerDay;
    }


    public int getUnhappinessGenerating() {
        return unhappinessGenerating;
    }

    public void setUnhappinessGenerating(int unhappinessGenerating) {
        this.unhappinessGenerating = unhappinessGenerating;
    }

    public double getTimeToRemoveShit() {
        return timeToRemoveShit;
    }

    public void setTimeToRemoveShit(double timeToRemoveShit) {
        this.timeToRemoveShit = timeToRemoveShit;
    }
    public int getCurrentShitCount() {
        return currentShitCount;
    }

    public void setCurrentShitCount(int currentShitCount) {
        this.currentShitCount = currentShitCount;
    }

    public Animal(int shits, double removeTime, int shitCount){
        setShitsPerDay(shits);
        setTimeToRemoveShit(removeTime);
        setCurrentShitCount(shitCount);
    }

    public void TakeShit()
    {

    }


}
