package technica2023;

import java.util.*;

public class FoodEntry{
  
    private String name;
    private ArrayList<String> allergens;
    private int calories;
    private String category;

    public FoodEntry(String name, ArrayList<String> allergens)
    {
        this.name = name;
        this.allergens = allergens;
    }
    
    public ArrayList<String> getAllergens()
    {
      return this.allergens;
    }

    public String getName(){
      return this.name;
    }

}
