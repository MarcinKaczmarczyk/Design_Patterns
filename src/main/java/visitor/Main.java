package visitor;

import visitor.activity.Squash;
import visitor.activity.Treadmill;
import visitor.activity.Weights;
import visitor.visitor.Visitor;
import visitor.visitor.VisitorImpl;

public class Main {
    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(200);
        Squash squash= new Squash(45);
        Weights weights= new Weights(50,10);

        VisitorImpl visitor=new VisitorImpl();

        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);
    }
}
