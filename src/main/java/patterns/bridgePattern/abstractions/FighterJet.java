package patterns.bridgePattern.abstractions;

import patterns.bridgePattern.implementation.Manufacturer;

public class FighterJet extends AirPlane {

    public FighterJet(Manufacturer manufacturer1, Manufacturer manufacturer2){
        super(manufacturer1, manufacturer2);
    }

    public void produce() {
        System.out.println("Beginning construction on a new fighter jet.");
        manufacturer1.work();
        manufacturer2.work();
    }
}
