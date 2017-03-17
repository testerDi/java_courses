package shopping.actions;

import shopping.db.Model;
import shopping.domain.Product;

/**
 * Created by ptcvas3 on 3/1/2017.
 */
public class BuyConfirmation implements Action  {
    private Product p;
    public BuyConfirmation(Product p) {
        this.p = p;
    }



    @Override
    public void showPrompt() {
        System.out.println(" Buy Confirmation :\n" +"Are you sure you want to Buy " + p.getName() + " for $" + p.getPrice() + "?\n\n" +
                "1. Yes, I am sure. Buy\n" +
                "2. No. Return to product details\n" +
                "3. Return to main menu");
    }

    @Override
    public Action perform(int i)
    {
        switch (i){
            case 1:
                if (Model.getInstance().getBalance() < p.getPrice()){
                    System.out.println("No money");
                    return new ProductList();
                }
                Model.getInstance().setBalance(Model.getInstance().getBalance() - p.getPrice());
                Model.getInstance().getProductsPurchased().add(p.getName());
                p.setQuantity(p.getQuantity() -1);
                

        }

        return null;
    }
}
