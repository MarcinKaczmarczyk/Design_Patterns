package visitor.visitor;

import visitor.activity.Squash;
import visitor.activity.Treadmill;
import visitor.activity.Weights;

public interface Visitor {
    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}
