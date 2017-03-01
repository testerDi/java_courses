package shopping;

import shopping.actions.Action;
import shopping.actions.MainMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ptcvas3 on 3/1/2017.
 */
public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Action currentAction = new MainMenu();
while (true){
        try{
            currentAction.showPrompt();
            Integer choice = scanner.nextInt();

            currentAction = currentAction.perform(choice);
            System.out.println();



        }
        catch (InputMismatchException e){
            scanner.next();
        }
        catch (Exception e){

            System.out.println("_______________________________");
        }
}

    }
}
