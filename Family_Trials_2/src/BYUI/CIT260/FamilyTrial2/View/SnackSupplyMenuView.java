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
public class SnackSupplyMenuView extends View{
    
    public SnackSupplyMenuView(){ 
        super("Snack Options\n" + "\tC - Carrot Sticks \n" + 
                         "\tA - Apple Slices\n" + "\tW - Water\n"
              + "\tB - Candy Bar \n" + "\tS - Soda \n" + "\tP - Potato Chips \n" +
                 "\tM - Quit" + "Please Select a Snack option");
    }
    
    @Override
    public boolean doAction(String value) {
           
        value = value.toUpperCase();
        
        switch(value.charAt(0)){
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
