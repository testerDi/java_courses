package shopping.actions;

/**
 * Created by ptcvas3 on 3/1/2017.
 */
public interface Action {
     void showPrompt();
    Action perform(int action);
}
