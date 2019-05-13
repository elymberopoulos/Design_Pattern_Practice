package patterns.bridgePattern.abstractions;

import patterns.bridgePattern.implementation.Manufacturer;

public class SingleProp extends AirPlane {

    public SingleProp(Manufacturer manufacturer1, Manufacturer manufacturer2){
        super(manufacturer1, manufacturer2);
    }

    public void produce() {
        System.out.println("Beginning work on a single propeller plane.");
        manufacturer1.work();
        manufacturer2.work();
    }


}
