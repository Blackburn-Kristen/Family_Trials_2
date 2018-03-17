/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials2.control;

import BYUI.CIT260.Family_Trials_2.model.Location;
import BYUI.CIT260.Family_Trials_2.model.Map;

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
        
        Map map = Map(noOfRows, noOfCol);
        noOfRows = 3;
        noOfCol = 25;
        Location[][] locationsInMap = new Location[noOfRows][noOfCol];
               
        scenes = createScenes();
        questions = createQuestions();
        
        assigneQuestionsToScenes();
        assignItemsToScenes();
        
        assignScenesToLocations();
        
        return map;
    }
    
    private static Location[][] createLocations(int rows,int columns){
       
        if( rows <1 || columns < 1 ){
            
            return null;
        }
        
        locations = new Location[][]();
               for( int i = 0; i < locations.length; i++ ){
                   for(int j = 0; j < locations.length; j++){
                       locations += Location[i][j]; 
                   }
               }
        
        return locations;
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
