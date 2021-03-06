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
public class StatusBarView extends View{
    
    public StatusBarView(){
        super("\nStatus Bar\n" + "\tC - Car health\n" + 
                         "\tH - Happiness\n" + "\tT - Time\n" + "\tX - Exit\n"
                            + "Please Select menu option");
        
    }
        @Override
        public boolean doAction(String value){
           
        value = value.toUpperCase();
        
        switch(value.charAt(0)){
            case 'C':
                showCarHealth();
                break;
            case 'H':
                showHappiness();
                break;
            case 'T':
                showTime();
                break;
            case 'X':
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid menu item.");
                return false;
        }
        return false;
          }

    private void showCarHealth() {
        this.console.println("showCarHealth() called");
    }

    private void showHappiness() {
       this.console.println("showHappiness() called");
    }

    private void showTime() {
        this.console.println("showTime() called");
    }


}
