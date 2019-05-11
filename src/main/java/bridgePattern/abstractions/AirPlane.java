package bridgePattern.abstractions;
import bridgePattern.implementation.Manufacturer;

/*
This is the main abstraction for the bridge design pattern.
 */
abstract class AirPlane {
    protected Manufacturer manufacturer1;
    protected Manufacturer Manufacturer2;

    protected AirPlane (Manufacturer manufacturer1, Manufacturer manufacturer2){
        this.manufacturer1 = manufacturer1;
        this.Manufacturer2 = manufacturer2;
    }

    public abstract void product();
}
