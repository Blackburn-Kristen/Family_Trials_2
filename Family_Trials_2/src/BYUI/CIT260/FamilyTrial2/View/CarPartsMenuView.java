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
public class CarPartsMenuView extends View {
    
    public CarPartsMenuView(){
       super("Car Parts Shop\n" + "\tO - Oil\n" + 
                         "\tC - Coolant\n" + "\tS - Spare Tires\n" + "\tX - Exit\n" +
                            "Please Select a menu option"); 
    }
     
    @Override
     public boolean doAction(String value){
           
        value = value.toUpperCase();
        
        switch(value.charAt(0)){
            case 'O':
                getOil();
                break;
            case 'C':
                getCoolant();
                break;
            case 'S':
                getSpareTire();
                break;
            case 'X':
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid menu item.");
                return false;
        }
        return false;
          }
     
    private void getOil() {
        GetOilMenuView getOilMenuView = new GetOilMenuView();
        getOilMenuView.display();
    }

    private void getCoolant() {
        ErrorView.display(this.getClass().getName(),"getCoolant() called");
    }

    private void getSpareTire() {
        ErrorView.display(this.getClass().getName(),"getSpareTire() called");
    }
    }

