package visitor.activity;

import visitor.visitor.Visitor;

public class Weights implements Activity{

    private int weight;
    private int reps;

    public Weights(int weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }
    public void calculateCaloriesBurned(){
        System.out.println("Calories burned lifting weights: "+ weight*reps*2);
    }

    public int getWeight() {
        return weight;
    }

    public int getReps() {
        return reps;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
