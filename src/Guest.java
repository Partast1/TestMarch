import java.util.Random;

public class Guest {
    private int contentment;
    private double visitingTime;

    public int getContentment() {
        return contentment;
    }

    public void setContentment(int contentment) {
        this.contentment = contentment;
    }

    public double getVisitingTime() {
        return visitingTime;
    }

    public void setVisitingTime(double visitingTime) {
        this.visitingTime = visitingTime;
    }

    public Guest(int startContent){
        setContentment(100);
    }


}
