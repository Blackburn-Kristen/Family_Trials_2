/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;
/**
 *
 * @author Katrina
 */
public class GetCarrotSticksMenuView extends View{
    
     public GetCarrotSticksMenuView(){
        super("Purchase Carrot Sticks\n" 
              + "Limit 5\n" 
              + "\tHow many Carrot Sticks would you like?\n"
              + "\t1 - One bag of Carrot Sticks\n" 
              + "\t2 - Two bags of Carrot Sticks\n"  
              + "\t3 - Three bags of Carrot Sticks\n"
              + "\t4 - Four bags of Carrot Sticks\n"
              + "\t5 - Five bags of Carrot Sticks\n"
              + "\t0 - I have enough Carrot Sticks return to the Snack Supply Menu\n");
    }
    
    @Override
     public boolean doAction(String value){
           
        value = value.toUpperCase();
        
        switch(value.charAt(0)){
            case '1':
               addCarrotSticksToInventory();
                break;
            case '2':
                addCarrotSticksToInventory();
                break;
            case '3':
                addCarrotSticksToInventory();
                break;
            case '4':
                addCarrotSticksToInventory();
                break;
            case '5':
                addCarrotSticksToInventory();
                break;
            case '0':
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid amount you can only purchase a maximum of 5 bags of Carrot Sticks.");
                return false;
        }
        return false;
          }
    
     private void addCarrotSticksToInventory(){
   ErrorView.display(this.getClass().getName(),"addCarrotSticksToInventory() called");
    }

    
    
    
}
