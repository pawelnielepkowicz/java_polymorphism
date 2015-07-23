/**
 * Created by Ja on 20/07/2015.
 */
public class Main {
    public static void main(String[] args) {

        Food kskfs = new Tuna();
        kskfs.eat();

        Food foodArray[] = new Food[3];
        foodArray[0] = new Tuna();
        foodArray[1] = new Potpie();
        foodArray[2] = new Food();
        // for(Food x; foodArray){

        //  x.eat();
        //  }

        for (int i = 0; i < foodArray.length; i++) {

            foodArray[i].eat();
        }

        // part 2

        polyFood polyObject = new polyFood();
        Food foodObject = new Food();
        Food tunaObject = new Tuna();

        polyObject.initiateEat(foodObject);
        polyObject.initiateEat(tunaObject);

        // abstract
        SubAbstract Sa = new SubAbstract();
        Sa.abstractEat();
        Sa.newEat();
        Sa.newEat();
        Sa.newEat();

        FoodList FL = new FoodList();
        Tuna TL = new Tuna();
        Food FF = new Food();
        Potpie PT = new Potpie();
        Food FP = new Potpie();

        FL.addFood(TL);
        FL.addFood(FF);
        FL.addFood(PT);
        FL.addFood(FP);



    }
}
