package bridgePattern.abstractions;

import bridgePattern.implementation.Manufacturer;

public class FighterJet extends AirPlane {

    public FighterJet(Manufacturer manufacturer1, Manufacturer manufacturer2){
        super(manufacturer1, manufacturer2);
    }

    public void product() {

    }
}
