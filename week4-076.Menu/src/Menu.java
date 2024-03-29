
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    public void addMeal(String meal){
        if(!(this.meals.contains(meal)))
            this.meals.add(meal);
    }
    // add the methods here
    public void printMeals(){
        for (String x : meals){
            System.out.println(x);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
}
