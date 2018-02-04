/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.Family_Trials_2.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author krist
 */
public class Menu implements Serializable {
    
    // class instances
    private String mainMenu;
    private String gameMenu;
    private String helpMenu;
    private String itemsMenu;

    public Menu() {
    }
    

    public String getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(String mainMenu) {
        this.mainMenu = mainMenu;
    }

    public String getGameMenu() {
        return gameMenu;
    }

    public void setGameMenu(String gameMenu) {
        this.gameMenu = gameMenu;
    }

    public String getHelpMenu() {
        return helpMenu;
    }

    public void setHelpMenu(String helpMenu) {
        this.helpMenu = helpMenu;
    }

    public String getItemsMenu() {
        return itemsMenu;
    }

    public void setItemsMenu(String itemsMenu) {
        this.itemsMenu = itemsMenu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.mainMenu);
        hash = 79 * hash + Objects.hashCode(this.gameMenu);
        hash = 79 * hash + Objects.hashCode(this.helpMenu);
        hash = 79 * hash + Objects.hashCode(this.itemsMenu);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Menu other = (Menu) obj;
        if (!Objects.equals(this.mainMenu, other.mainMenu)) {
            return false;
        }
        if (!Objects.equals(this.gameMenu, other.gameMenu)) {
            return false;
        }
        if (!Objects.equals(this.helpMenu, other.helpMenu)) {
            return false;
        }
        if (!Objects.equals(this.itemsMenu, other.itemsMenu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Menu{" + "mainMenu=" + mainMenu + ", gameMenu=" + gameMenu + ", helpMenu=" + helpMenu + ", itemsMenu=" + itemsMenu + '}';
    }
    
    
}
