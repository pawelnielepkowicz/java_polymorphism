/**
 * Created by Ja on 21/07/2015.
 */
public class FoodList {
    private Food[] foodList = new Food[5];
    private int foodCounter = 0;

    public void addFood(Food F){
        if(foodCounter<foodList.length){

            foodList[foodCounter] = F;
            foodCounter++;
            System.out.println("Food added ar index: " + foodCounter);

        }
    }
}
