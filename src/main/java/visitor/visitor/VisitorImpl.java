package visitor.visitor;

import visitor.activity.Squash;
import visitor.activity.Treadmill;
import visitor.activity.Weights;

public class VisitorImpl implements Visitor{
    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned running on treadmill: "+ treadmill.getDistance()*3);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned running squash: "+ squash.getMinutesPlayed()*20);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting weights: "+ weights.getWeight()*weights.getReps()*2);
    }
}
