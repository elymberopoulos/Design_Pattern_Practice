package userInterface;

import patternRunner.PatternRunner;

public class UserInterface {

    private PatternRunner runner;

    public UserInterface() {
        this.runner = new PatternRunner();
    }

    public void Print(String msg) {
        System.out.println(msg);
    }

    public void Greeting() {
        Print("\nWelcome to the command line application for running examples of design patterns \n");
        Print("In software engineering, a software design pattern is a general, reusable solution" +
                "\nto a commonly occurring problem within a given context in software design. \n\n");
    }

    public void MainPrompt() {
        Print("Type 'help' if needed.");
        Print("Please enter a command: ");
    }

    public void Help(){
        Print("AVAILABLE COMMANDS: 'visitor', 'bridge', 'command', 'exit'");
    }

    public void UserPatternSelector(String choice) {
        String ignoreCase = choice.toLowerCase();
        switch (ignoreCase) {
            case "visitor":
                runner.RunVisitorPattern();
                break;

            case "command":
                runner.RunCommandPattern();
                break;

            case "bridge":
                runner.RunBridgePattern();
                break;

            case "help":
                Help();
                break;

            case "exit":
                System.exit(0);
                break;

            default:
                Print("\n");
                Print("USER INPUT ERROR (Invalid Entry)");
                Print("\n");
                break;
        }
    }

}
