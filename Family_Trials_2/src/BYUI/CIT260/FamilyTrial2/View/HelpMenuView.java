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
class HelpMenuView extends View{

    public HelpMenuView(){
        super("Getting Help\n" + "\tG - What is the goal of the game? \n" + 
                         "\tM - How to move.\n" + "\tB - Show Status Bar \n"
              + "\tS - Supplies \n" + "\tX - Exit to main menu" + "Please Selecy a menu option");
    }
    @Override
     public boolean doAction(String value){
           
        value = value.toUpperCase();
        
        switch(value.charAt(0)){
            case 'G':
                goalOfGame();
                break;
            case 'M':
                howToMove();
                break;
            case 'B':
                showStatusBar();
                break;
            case 'S':
                supplyShop();
                break;
            case 'X':
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid menu item.");
                return false;
        }
        return false;
          }

    private void goalOfGame() {
        GoalOfGameView goalOfGameView = new GoalOfGameView();
        goalOfGameView.displayGoalOfGameView();
    }

    private void howToMove() {
        ErrorView.display(this.getClass().getName(),"howToMove() Called");
    }

    private void showStatusBar() {
        StatusBarView statusBarView = new StatusBarView();
         statusBarView.display();
    }

    private void supplyShop() {
        SupplyShopView supplyShopView = new SupplyShopView();
        supplyShopView.display();
    }


}
