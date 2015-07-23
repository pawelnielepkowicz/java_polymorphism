/**
 * Created by Ja on 21/07/2015.
 */
public class SubAbstract extends SuperAbstract {
    @Override
    public void abstractEat() {

        System.out.println("AbstractEat");

    }

    public void newEat() {

        System.out.println("newEat abstractInt: " + ++abstractInt);

    }
}
