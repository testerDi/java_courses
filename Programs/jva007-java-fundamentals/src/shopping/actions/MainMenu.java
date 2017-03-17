package shopping.actions;

/**
 * Created by ptcvas3 on 3/1/2017.
 */
public class MainMenu implements Action {

    @Override
    public void showPrompt() {
        String prompt = "1 - Product list\n" + "2 - Manufacturer list\n" +"0 - Exit\n";
        System.out.println(prompt);

    }

    @Override
    public Action perform(int i) {
        switch (i) {
            case 1:
                return new ProductList();
            case 2:
                return new ManufacturerList();

            case 0:
                System.out.println("System is exit");
                System.exit(0);

                default:
                    return this;


        }


    }
}