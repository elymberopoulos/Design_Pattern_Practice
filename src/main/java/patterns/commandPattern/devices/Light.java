package patterns.commandPattern.devices;

public class Light {

    private boolean on;

    public Light(){
        this.on = false;
    }

    public void switchPower(){
        this.on = !on;
    }

    public boolean getPowerState(){
        return on;
    }

}
