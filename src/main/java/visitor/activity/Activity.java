package visitor.activity;

import visitor.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}
