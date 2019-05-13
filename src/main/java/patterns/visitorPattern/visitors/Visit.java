package patterns.visitorPattern.visitors;

import patterns.visitorPattern.acceptors.Accept;

public interface Visit {

    public void visit(Accept item);
}
