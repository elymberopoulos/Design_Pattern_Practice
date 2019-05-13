package patterns.bridgePattern.implementation;

public class StageTwoProduction implements Manufacturer {

    public StageTwoProduction(){}

    public void work() {
        System.out.println("Avionics added to chassis.");
    }
}
