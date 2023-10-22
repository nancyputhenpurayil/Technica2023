package technica2023;

import javax.swing.*;
import java.util.*;
import java.awt.*;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Main{

public static void main(String[] args){
  
    
  ArrayList<String> allergensMESW = new ArrayList<String>();//MESW = milk, egg, soy, wheat

  allergensMESW.add("Milk");
  allergensMESW.add("Egg");
  allergensMESW.add("Soy");
  allergensMESW.add("Wheat");

  ArrayList<String> allergensMT = new ArrayList<String>();//MT = milk, tree nuts
  allergensMT.add("Treenuts");
  allergensMT.add("Milk");

  ArrayList<String> allergensMS = new ArrayList<String>();//MT = milk, tree nuts
  allergensMS.add("Soy");
  allergensMS.add("Milk");
   
  ArrayList<String> allergensNone = new ArrayList<String>();
  allergensNone.add("none");
  
  ArrayList<String> allergensMSW = new ArrayList<String>();//MSW= milk, soy, wheat
  allergensMSW.add("Milk");
  allergensMSW.add("Soy");
  allergensMSW.add("Wheat");
  
  ArrayList<String> allergensMSWS = new ArrayList<String>();//MT = milk, tree nuts
  allergensMSWS.add("Soy");
  allergensMSWS.add("Milk");
  allergensMSWS.add("Wheat");
  allergensMSWS.add("Seaame");

  FoodEntry chickenBiscuit = new FoodEntry("Chicken Biscuit", allergensMESW);  
  FoodEntry spicyChickenBiscuit = new FoodEntry("Spicy Chicken Biscuit", allergensMESW);                           
  FoodEntry chickNMinis = new FoodEntry("Chick-n-Minis", allergensMESW); 
  FoodEntry eggWhiteGrill = new FoodEntry("Egg White Grill", allergensMESW); 
  FoodEntry hashBrownScrambleBurrito = new FoodEntry("Hash Brown Scramble Burrito", allergensMESW);
  FoodEntry hashBrownScrambleBowl = new FoodEntry("Hash Brown Scramble Bowl", allergensMESW);
  FoodEntry hashBrowns = new FoodEntry("Hash Browns", allergensNone);
  FoodEntry ChickenEggCheeseBiscuit = new FoodEntry("Chicken, Egg, and Cheese Biscuit", allergensMESW);
  FoodEntry BaconEggCheeseBiscuit = new FoodEntry("Bacon, Egg, and Cheese Biscuit", allergensMESW);
  FoodEntry SausageEggCheeseBiscuit = new FoodEntry("Sausage, Egg, and Cheese Biscuit", allergensMESW);
  FoodEntry ChickenEggCheeseMuffin = new FoodEntry("Chicken, Egg & Cheese Muffin", allergensMESW);
  FoodEntry BaconEggCheeseMuffin = new FoodEntry("Bacon, Egg & Cheese Muffin", allergensMESW);
  FoodEntry SausageEggCheeseMuffin = new FoodEntry("Sausage, Egg & Cheese Muffin", allergensMESW);
  FoodEntry BreakfastBreads = new FoodEntry("Breakfast Breads", allergensMSW);
  FoodEntry MarketSalad = new FoodEntry("Market Salad", allergensMT);
  FoodEntry YogurtParfait = new FoodEntry("Greek Yogurt Parfait", allergensMT);
  FoodEntry ChickenSandwich = new FoodEntry(null, allergensMSW);
  FoodEntry WafflePotatoChips = new FoodEntry("Waffle Potato Chips", allergensNone);
  FoodEntry CaramelMilkshake = new FoodEntry("Caramel Crumble Milkshake", allergensMS);
  FoodEntry CoolWrap = new FoodEntry("ChickFilA Cool Wrap", allergensMSW);

  Menu menu = new Menu("ChickFilA", new ArrayList<FoodEntry>());

  menu.addToMenu(chickenBiscuit);
  menu.addToMenu(spicyChickenBiscuit);
  menu.addToMenu(chickNMinis);
  menu.addToMenu(eggWhiteGrill);
  menu.addToMenu(hashBrownScrambleBurrito);
  menu.addToMenu(hashBrownScrambleBowl);
  menu.addToMenu(hashBrowns);
  menu.addToMenu(ChickenEggCheeseBiscuit);
  menu.addToMenu(BaconEggCheeseBiscuit);
  menu.addToMenu(SausageEggCheeseBiscuit);
  menu.addToMenu(ChickenEggCheeseMuffin);
  menu.addToMenu(BaconEggCheeseMuffin);
  menu.addToMenu(SausageEggCheeseMuffin);
  menu.addToMenu(BreakfastBreads);
  menu.addToMenu(MarketSalad);
  menu.addToMenu(YogurtParfait);
  menu.addToMenu(CoolWrap);
  menu.addToMenu(CaramelMilkshake);
  menu.addToMenu(ChickenSandwich);
  menu.addToMenu(WafflePotatoChips);

//ArrayList<String> userAllergen = new ArrayList<String>();
//userAllergen.add("Egg");


JFrame f = new JFrame("AllerGys");  
    
    JLabel statusLabel = new JLabel("Select your allergies: ");
    statusLabel.setBounds(50,3,200,25);
    statusLabel.setForeground(Color.red);
    f.add(statusLabel);

    
    
    JLabel outputs = new JLabel("You can eat...");
    outputs.setBounds(300,75,200,25);
    outputs.setBackground(Color.blue);
    f.add(outputs);

    
    

      JCheckBox checkBox1 = new JCheckBox("Milk");  
      checkBox1.setBounds(50,20, 150,50);  
      JCheckBox checkBox2 = new JCheckBox("Eggs");  
      checkBox2.setBounds(50,55,150,50);  
      JCheckBox checkBox3 = new JCheckBox("Soy");
      checkBox3.setBounds(50,90, 150,50);
      JCheckBox checkBox4 = new JCheckBox("Wheat");
      checkBox4.setBounds(50,125,150,50);
      JCheckBox checkBox5 = new JCheckBox("Sesame");
      checkBox5.setBounds(50,160,150,50);
      JCheckBox checkBox6 = new JCheckBox("Tree nuts");
      checkBox6.setBounds(50,195,150,50);
      JCheckBox checkBox7 = new JCheckBox("Peanuts");
      checkBox7.setBounds(50,230,150,50);
      JCheckBox checkBox8 = new JCheckBox("Fish");
      checkBox8.setBounds(50,265,150,50);

      f.add(checkBox1);  
      f.add(checkBox2);  
      f.add(checkBox3);
      f.add(checkBox4);
      f.add(checkBox5);
      f.add(checkBox6);
      f.add(checkBox7);
      f.add(checkBox8);

      f.setSize(500,500);  
      f.setLayout(null);  
      f.setVisible(true);  

      JButton allergyButton = new JButton("Done");
      allergyButton.setBackground(Color.green);
      allergyButton.setBounds(50,325,100,33);
      allergyButton.setBorder(BorderFactory.createBevelBorder(0));
      f.add(allergyButton);

      ArrayList<String> userAllergen = new ArrayList<String>();
      
    
    checkBox1.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED){
                userAllergen.add("Milk");
            }
        }
    });
    checkBox2.addItemListener(new ItemListener() {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED){
                userAllergen.add("Eggs");
            }
        }
    });
    checkBox3.addItemListener(new ItemListener() {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED){
                userAllergen.add("Soy");
            }
        }
    });
    checkBox4.addItemListener(new ItemListener() {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED){
                userAllergen.add("Wheat");
            }
        }
    });
    checkBox5.addItemListener(new ItemListener() {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED){
                userAllergen.add("Sesame");
            }
        }
    });
    checkBox6.addItemListener(new ItemListener() {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED){
                userAllergen.add("Tree nuts");
            }
        }
    });
    checkBox7.addItemListener(new ItemListener() {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED){
                userAllergen.add("Peanuts");
            }
        }
    });
    checkBox8.addItemListener(new ItemListener() {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED){
                userAllergen.add("Fish");
            }
        }
    });



    allergyButton.addActionListener(new ActionListener() {
   

       public void actionPerformed(ActionEvent e) {
           ArrayList<FoodEntry> result = new ArrayList<FoodEntry>();
result = ChickFilA.canEat(menu, userAllergen);
        String grub = "";
         for(int i =0; i< result.size();i++){
            grub += result.get(i).getName() + ",";

           }

            JTextField textbox = new JTextField(grub);
    textbox.setBounds(300,100,800,200);
    f.add(textbox);
       }
    });

   
    
  }
}


