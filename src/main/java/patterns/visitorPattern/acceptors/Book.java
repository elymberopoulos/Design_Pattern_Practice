package patterns.visitorPattern.acceptors;
import patterns.visitorPattern.visitors.Visit;

import java.util.Random;

public class Book implements Accept {
    private int price;
    private Random random = new Random();

    public Book(){
        this.price = random.nextInt(15);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int accept(Visit visitor) {
        return this.getPrice();
    }
}
