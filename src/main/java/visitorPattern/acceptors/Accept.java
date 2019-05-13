package visitorPattern.acceptors;

import visitorPattern.visitors.Visit;

public interface Accept {
    public int accept(Visit visitor);
}
