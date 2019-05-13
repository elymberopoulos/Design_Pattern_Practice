package visitorPattern.visitors;

import visitorPattern.acceptors.Accept;

public interface Visit {

    public void visit(Accept item);
}
