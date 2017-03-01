package shopping.actions;

import shopping.db.Model;
import shopping.domain.Product;

/**
 * Created by ptcvas3 on 3/1/2017.
 */
public class ProductList implements Action {
    @Override
    public void showPrompt() {
        System.out.println("Product List");
        for (int i = 0; i < Model.getInstance().getProducts().size(); i++) {
            Product pr = Model.getInstance().getProducts().get(i);
            System.out.println("Name: " + pr.getName() + " Price " + pr.getPrice());

        }

        System.out.println("0 - Main Menu");


    }

    @Override
    public Action perform(int i) {
        if (i == 0)
            return new MainMenu();
        else
            return this;


    }

}


