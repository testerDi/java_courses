package shopping.actions;

import shopping.db.Model;
import shopping.domain.Manufacturer;

/**
 * Created by ptcvas3 on 3/1/2017.
 */
public class ManufacturerDetails implements Action {
    private Manufacturer manufacturer;

    public ManufacturerDetails(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }


    @Override
    public void showPrompt() {
        System.out.println("Manufacturer List: ");
        System.out.println("Name: " + manufacturer.getName() + "\nDescription : \n" + manufacturer.getDescription() + "\nOrigin country: " + manufacturer.getOriginCountry() + "\nUrl : " + manufacturer.getUrl());


        System.out.println("\n 1 - Manufacturer list");
        System.out.println("\n 2 - Main menu");
    }

    @Override
    public Action perform(int i) {
        switch (i) {
            case 1:
                return new ManufacturerList();
            case 2:
                return new MainMenu();


            default:
                return this;
        }

    }
}