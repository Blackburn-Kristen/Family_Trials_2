/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;

import java.util.Scanner;

/**
 *
 * @author Katrina
 */
public class SnackSupplyMenuView {
    
    public SnackSupplyMenuView(){    
    }
    
    void displaySnackSupplyMenuView() {
         
        boolean endOfView = false;
        do{
           String[] inputs = getInputs();
           
           if(inputs[0] == null || "Q".equals(inputs[0]) || "q".equals(inputs[0])){
               continue;
           }
               
           endOfView = doAction(inputs);
        }
           while(endOfView != true);
        
    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        
         System.out.println("Snack Options\n" + "\tC - Carrot Sticks \n" + 
                         "\tA - Apple Slices\n" + "\tW - Water\n"
              + "\tB - Candy Bar \n" + "\tS - Soda \n" + "\tP - Potato Chips \n" +
                 "\tM - Quit");
        
          System.out.println("Please Select a Snack option");
          
      
      boolean valid = false;
      
      while( valid == false ){
          
          Scanner inFile;
          inFile = new Scanner(System.in);
          
          String option = inFile.nextLine();
          
          if(option.length() < 1 ){
              System.out.println("You must enter a Shop value");
              continue;
          }
          
          inputs[0] = option.trim();
          
          valid = true;
          }
          return inputs;
    
    }

    private boolean doAction(String[] inputs) {
           
        String[] menuItem = inputs;
        String item = menuItem[0].toUpperCase();
        
        switch(item.charAt(0)){
            case 'C':
                carrotSticks();
                break;
            case 'A':
                appleSlices();
                break;
            case 'W':
                water();
                break;
            case 'B':
                candyBar();
                break;
            case 'S':
                Soda();
                break;
            case 'P':
                potatoChips();
                break;
            case 'M':
                quit();
                return true;
            default:
                System.out.println("Invalid menu item.");
                return false;
        }
        return false;
          }

    private void carrotSticks() {
        System.out.println("carrotSticks() Called");
    }

    private void appleSlices() {
        System.out.println("appleSlices() Called");
    }

    private void water() {
        System.out.println("water() Called");
    }

    private void candyBar() {
       System.out.println("candyBar() Called");
    }

    private void Soda() {
        System.out.println("soda() Called");
    }

    private void potatoChips() {
        System.out.println("potatoChips() Called");
    }

    private void quit() {
        System.out.println("quit() Called");
    }

    
}
