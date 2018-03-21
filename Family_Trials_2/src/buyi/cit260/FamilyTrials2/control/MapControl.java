/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials2.control;

import BYUI.CIT260.Family_Trials_2.model.Inventory;
import BYUI.CIT260.Family_Trials_2.model.Location;
import BYUI.CIT260.Family_Trials_2.model.Map;
import BYUI.CIT260.Family_Trials_2.model.Questions;
import BYUI.CIT260.Family_Trials_2.model.Scenes;
import javafx.scene.Scene;

/**
 *
 * @author Katrina
 */
public class MapControl {
   
    
    
    public MapControl(){
    }
    
    public static Map createMap(int noOfRows, int noOfCol){
        
        if( noOfRows < 0 || noOfCol < 0 ){
            
            return null;
        }
        
       
       Map map =  new Map(noOfRows, noOfCol);
       Location[][] locations;
        locations = new Location[noOfRows][noOfCol];
               for( int i = 0; i < locations.length; i++ ){
                   for(int j = 0; j < locations.length; j++){
                      Location temp = new Location();
                      temp.setRow(i);
                      temp.setCol(j);
                      temp.setVisited(false);
                      locations[i][j] = temp;
                   }
               }
               map.setLocation(locations);
        
        return map;
    }
    
   
private static Scenes[] createScenes(){
    
    Scenes[] scenes;
    scenes = new Scenes[25];
        return null;
 
}
private static Questions[] createQuestions(){
        return null;
    
}
private static void assignQuestionsToScenes(Questions[] questions,Scene[] scenes){
    
}
private static void assignItemsToScenes(Inventory[] items, Scene[] scenes){
    
}
private static void assignScenesToLocations(Scene[] scenes,Location[][] locations){
    
    
}
    
}
