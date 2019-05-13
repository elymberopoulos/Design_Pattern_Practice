package visitorPattern.visitors;

import visitorPattern.acceptors.Accept;

import java.util.ArrayList;
import java.util.List;

public class Shopper implements Visit {

    private List<Integer> cart;

    public Shopper(){
        this.cart = new ArrayList<Integer>();
    }

    public List<Integer> getCart() {
        return cart;
    }

    public void visit(Accept item) {
        this.cart.add(item.accept(this));
    }
}
