/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials2.control;

import BYUI.CIT260.Family_Trials_2.model.Location;
import BYUI.CIT260.Family_Trials_2.model.Map;
import BYUI.CIT260.Family_Trials_2.model.Questions;
import BYUI.CIT260.Family_Trials_2.model.Scenes;

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
        
        
        noOfRows = 3;
        noOfCol = 25;
        Map map = Map(noOfRows, noOfCol);
        locations = new Location[][]();
               for( int i = 0; i < locations.length; i++ ){
                   for(int j = 0; j < locations.length; j++){
                       locations += Location[i][j];
                   }
               }
        Location[i][j] locationsInMap = new Location[noOfRows][noOfCol];
               
        Scenes scenes = createScenes();
        Questions questions = createQuestions();
        
        assignQuesions = assigneQuestionsToScenes();
        addignItems = assignItemsToScenes();
        
        assignScenesToLocations = assignScenesToLocations();
        
        
        return map;
    }
    
   
private static Scene[] createScenes(){
        return null;
 
}
private static Question[] createQuestions(){
        return null;
    
}
private static void assignQuestionsToScenes(Question[] questions,Scene[] scenes){
    
}
private static void assignItemsToScenes(InventoryItem[] items, Scene[] scenes){
    
}
private static void assignScenesToLocations(Scene[] scenes,Location[][] locations){
    
    
}
    
}
