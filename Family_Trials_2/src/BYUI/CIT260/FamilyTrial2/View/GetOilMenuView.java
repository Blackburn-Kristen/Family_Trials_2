/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;

/**
 *
 * @author krist
 */
public class GetOilMenuView extends View{
    
    public GetOilMenuView(){
        super("Purchase More Oil\n" + "Limit 2\n" + "\tHow much oil do you need?\n"
              + "\t1 - One container of oil\n" + "\t2 - Two containers of oil\n" + "\t0 - I have enough oil return to the Car Parts Menu\n");
    }
    
    @Override
     public boolean doAction(String value){
           
        value = value.toUpperCase();
        
        switch(value.charAt(0)){
            case '1':
               addOilToInventory();
                break;
            case '2':
                addOilToInventory();
                break;
            case '0':
                return true;
            default:
                System.out.println("Invalid amount you can only purchase a maximum of 2 containers of oil");
                return false;
        }
        return false;
          }
    
     private void addOilToInventory(){
    System.out.println("addOilToInventory() called");
}
}


