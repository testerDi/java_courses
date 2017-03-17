package shopping.actions;

import shopping.db.Model;
import shopping.domain.Product;

/**
 * Created by ptcvas3 on 3/1/2017.
 */
public class ProductDetails implements Action {
    private Product product;

    public ProductDetails(Product product) {
        this.product = product;
    }


    @Override
    public void showPrompt() {
        System.out.println("Product details :");
        System.out.println("Manufacturer :" + product.getManufacturer().getName());
        System.out.println("Price :" + product.getPrice());
        System.out.println("Quantity of the product :" + product.getQuantity());
        System.out.println("****************************************** :");
        System.out.println(product.getDescription());

        System.out.println("\n" + "1 Buy Product\n" + "2 View Manufacturer details\n" + "3 Return to the list of the products\n" + "4 Return to the Main Mane");

        }



    @Override
    public Action perform(int i) {
        switch (i){
            case 1:  return new BuyConfirmation();
            case 2 : return new ManufacturerDetails(product.getManufacturer());
            case 3 : return new ProductList();
            case 4 : return new MainMenu();
            default: return this;
        }


    }
}
