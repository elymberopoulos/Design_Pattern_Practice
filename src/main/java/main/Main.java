package main;

import userInterface.UserInterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        UserInterface ui = new UserInterface();
        Scanner scanner = new Scanner(System.in);

        ui.Greeting();

        while (true){
            ui.MainPrompt();
            String userInput = scanner.nextLine();
            ui.UserPatternSelector(userInput);
        }



    }
}
