package technica2023;
import java.util.*;

public class Menu{
  private String name;
  private ArrayList<FoodEntry> menu;
  
  public Menu(String nameInput, ArrayList<FoodEntry> menu)
  {
    this.name = nameInput;
    this.menu = menu;
  }
  public ArrayList<FoodEntry> getArrayString()
  {
    return this.menu;
  }

  public ArrayList<FoodEntry> getMenu(){
    return menu;
  }

  public void addToMenu(FoodEntry addFood){
    menu.add(addFood);
  }
}