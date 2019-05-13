package patterns.bridgePattern.abstractions;
import patterns.bridgePattern.implementation.Manufacturer;

/*
This is the main abstraction for the bridge design pattern.
 */
public abstract class AirPlane {
    protected Manufacturer manufacturer1;
    protected Manufacturer manufacturer2;

    protected AirPlane (Manufacturer manufacturer1, Manufacturer manufacturer2){
        this.manufacturer1 = manufacturer1;
        this.manufacturer2 = manufacturer2;
    }

    public abstract void produce();
}
