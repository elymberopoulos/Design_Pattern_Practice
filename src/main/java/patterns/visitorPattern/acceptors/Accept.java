package patterns.visitorPattern.acceptors;

import patterns.visitorPattern.visitors.Visit;

public interface Accept {
    public int accept(Visit visitor);
}
