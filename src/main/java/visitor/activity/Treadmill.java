package visitor.activity;

import visitor.visitor.Visitor;

public class Treadmill implements Activity {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public void calculateCaloriesBurned(){
        System.out.println("Calories burned running on treadmill: "+ distance*3);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
