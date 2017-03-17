package shopping.actions;

import shopping.db.Model;
import shopping.domain.Manufacturer;

/**
 * Created by ptcvas3 on 3/1/2017.
 */
public class ManufacturerList implements Action {
    @Override
    public void showPrompt() {
        System.out.println("Manufacturer List: ");
        for (int i = 0; i < Model.getInstance().getManufacturers().size(); i++){
            Manufacturer mr = Model.getInstance().getManufacturers().get(i);
            System.out.println("Name: " + mr.getName());
        }
        System.out.println("\n 0 - Main menu");

    }

    @Override
    public Action perform(int i) {
        if (i == 0)
            return new MainMenu();
        if (i > 0 && i <= Model.getInstance().getManufacturers().size()){
            return new ManufacturerDetails(Model.getInstance().getManufacturers().get(i - 1));
        }

        return this;
    }
}
