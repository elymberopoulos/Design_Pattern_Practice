package main;

import bridgePattern.abstractions.AirPlane;
import bridgePattern.abstractions.FighterJet;
import bridgePattern.abstractions.SingleProp;
import bridgePattern.implementation.StageOneProduction;
import bridgePattern.implementation.StageTwoProduction;
import visitorPattern.Book;
import visitorPattern.Shopper;

public class Main {

    public static void main(String[] args){
        /*
        This is work for the visitorPattern design pattern. It is a simple example.
        The customer is able to 'visit' a book which accepts the visitorPattern.
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


        System.out.println("Bridge Pattern Section \n");
        AirPlane planeOne = new FighterJet(new StageOneProduction(), new StageTwoProduction());
        planeOne.produce();

        System.out.println();

        AirPlane planeTwo = new SingleProp(new StageOneProduction(), new StageTwoProduction());
        planeTwo.produce();
        System.out.println("\nEnd of Bridge Section. \n");


    }
}
