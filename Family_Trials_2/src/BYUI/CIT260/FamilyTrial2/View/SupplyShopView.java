/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;

import java.util.Scanner;

/**
 *
 * @author krist
 */
public class SupplyShopView extends View{
    
    public SupplyShopView(){
        super("Supply Shop\n" + "\tS - See Snack Options\n" + 
                         "\tC - See Car Part Options\n" + "\tM - Exit to Main Menu\n"
                            + "Please Select a Menu option");
    }

    @Override
     public boolean doAction(String value){
           
        value = value.toUpperCase();
        
        switch(value.charAt(0)){
            case 'S':
                snackOptions();
                break;
            case 'C':
                carPartOptions();
                break;
            case 'M':
                return true;
            default:
                System.out.println("Invalid menu item.");
                return false;
        }
        return false;
          }

    private void snackOptions() {
       SnackSupplyMenuView snackSupplyMenuView = new SnackSupplyMenuView();
        snackSupplyMenuView.display();
    }

    private void carPartOptions() {
       CarPartsMenuView carPartsMenuView = new CarPartsMenuView();
        carPartsMenuView.display();
    }


}
