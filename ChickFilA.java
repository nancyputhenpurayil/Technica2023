package technica2023;

import java.util.*;

public class ChickFilA
{
  ArrayList<FoodEntry> menu = new ArrayList<FoodEntry>();
  Menu chickFilA = new Menu("Chick Fil A", menu);

    public static ArrayList<FoodEntry> canEat(Menu object, ArrayList<String> allergies)
    {
      //boolean ifContainsAllergen = false;
      ArrayList<FoodEntry> canEatOnMenu = new ArrayList<FoodEntry>();
      for(int i = 0; i < object.getMenu().size(); i++)
      { //items on menu
      int counter = 0;
        for(int j = 0; j < object.getMenu().get(i).getAllergens().size(); j++)
        { //ingredients on each item
          for(int k = 0; k < allergies.size(); k++)
          {
            if(object.getMenu().get(i).getAllergens().get(j).equals(allergies.get(k)))
            {
              counter++;
            }
          }
        }
        if(counter == 0)
        {
        canEatOnMenu.add(object.getMenu().get(i));
        }
      }
      for(int i = 0; i < canEatOnMenu.size(); i++)
      {
        System.out.println(canEatOnMenu.get(i).getName());
      }
      return canEatOnMenu;
    }
  }