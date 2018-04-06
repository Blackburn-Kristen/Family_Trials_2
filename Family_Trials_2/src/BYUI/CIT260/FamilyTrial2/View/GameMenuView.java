/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;

import BYUI.CIT260.FamilyTrials2.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author krist
 */
public class GameMenuView extends View{

    public GameMenuView() {
        super("Game Menu\n" 
                + "\tM - View Map\n" 
                + "\tI - Items in Inventory\n"
                + "\tV - View List of Vehicles\n "
                + "\tO - View Overall Happiness\n"
                + "\tH - Help\n" 
                + "\tS - Save\n"
                + "\tE - Exit\n" );
        
        
    }

      @Override 
        public boolean doAction(String value){
           
        value = value.toUpperCase();
        
        switch(value.charAt(0)){
            case 'M':
                viewMap();
                break;
            case 'I':
                viewInventory();
                break;
            case 'V':
                viewListVehicles();
                break;
            case 'O':
                viewStatus();
                break;    
            case 'H':
                help();
                break;
            case 'S':
                save();
                break;    
            case 'E':
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid menu item.");
                return false;
        }
        return false;
    }

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewListVehicles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void help() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
