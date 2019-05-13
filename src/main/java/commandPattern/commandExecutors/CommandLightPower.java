package commandPattern.commandExecutors;

import commandPattern.devices.Light;

public class CommandLightPower implements Command {

    private Light light;

    public CommandLightPower(Light light){
        this.light = light;
    }

    public void execute() {
        light.switchPower();
    }
}
