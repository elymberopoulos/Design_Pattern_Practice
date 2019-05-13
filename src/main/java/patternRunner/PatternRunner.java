package patternRunner;

import patterns.bridgePattern.abstractions.AirPlane;
import patterns.bridgePattern.abstractions.FighterJet;
import patterns.bridgePattern.abstractions.SingleProp;
import patterns.bridgePattern.implementation.StageOneProduction;
import patterns.bridgePattern.implementation.StageTwoProduction;
import patterns.commandPattern.commandExecutors.CommandLightPower;
import patterns.commandPattern.devices.Light;
import patterns.visitorPattern.acceptors.Book;
import patterns.visitorPattern.visitors.Shopper;

public class PatternRunner {

    public PatternRunner(){}

    public void RunBridgePattern(){
        System.out.println("Bridge Pattern Section \n");
        AirPlane planeOne = new FighterJet(new StageOneProduction(), new StageTwoProduction());
        planeOne.produce();

        System.out.println();

        AirPlane planeTwo = new SingleProp(new StageOneProduction(), new StageTwoProduction());
        planeTwo.produce();
        System.out.println("\nEnd of Bridge Section. \n");
    }

    public void RunVisitorPattern(){
        /*
        This is work for the patterns.visitorPattern design pattern. It is a simple example.
        The customer is able to 'visit' a book which accepts the patterns.visitorPattern.
        When the customer is accepted the book price is returned.
        The price is inserted into the shoppin cart array in the visit method.
         */
        System.out.println("Visitor Pattern Section \n");
        Book book1 = new Book();
        Book book2 = new Book();
        System.out.println(book1.getPrice());
        System.out.println(book2.getPrice());
        Shopper customer1 = new Shopper();

        System.out.println("Empty cart " + customer1.getCart());
        customer1.visit(book1);
        System.out.println("One Item cart " + customer1.getCart());
        customer1.visit(book2);
        System.out.println("Two Item cart " + customer1.getCart());
        System.out.println("\nEnd of Visitor Section. \n");
    }

    public void RunCommandPattern(){
        System.out.println("Command Pattern Section \n");
        Light light1 = new Light();
        CommandLightPower lightExecutor = new CommandLightPower(light1);
        System.out.println(light1.getPowerState());

        System.out.println();

        lightExecutor.execute();
        System.out.println(light1.getPowerState());
    }

}
