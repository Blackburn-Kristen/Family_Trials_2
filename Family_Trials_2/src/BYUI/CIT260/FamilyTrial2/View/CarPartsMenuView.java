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
                         "\tC - Coolant\n" + "\tS - Spare Tires" + "\tM - Exit to Main Menu\n" +
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
            case 'M':
                return true;
            default:
                System.out.println("Invalid menu item.");
                return false;
        }
        return false;
          }

    private void getOil() {
        System.out.println("getOil() called");
    }

    private void getCoolant() {
        System.out.println("getCoolant() called");
    }

    private void getSpareTire() {
        System.out.println("getSpareTire() called");
    }
    }

