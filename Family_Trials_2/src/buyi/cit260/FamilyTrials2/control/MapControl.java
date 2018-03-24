/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials2.control;

import BYUI.CIT260.Family_Trials_2.model.Inventory;
import BYUI.CIT260.Family_Trials_2.model.Location;
import BYUI.CIT260.Family_Trials_2.model.Map;
import BYUI.CIT260.Family_Trials_2.model.QuestionType;
import BYUI.CIT260.Family_Trials_2.model.Questions;
import BYUI.CIT260.Family_Trials_2.model.SceneType;
import static BYUI.CIT260.Family_Trials_2.model.SceneType.start;
import BYUI.CIT260.Family_Trials_2.model.Scenes;
import java.util.ArrayList;
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
               
               Scenes[] scenes;
               scenes = new Scenes[30];
               scenes = createScenes();
               Questions[] questions;
               questions = new Questions[29];
               questions = createQuestions();
               
               assignQuestionsToScenes(questions, scenes);
               
               assignScenesToLocations(scenes, locations);
               
        return map;
    }
    
   
private static Scenes[] createScenes(){
    
    Scenes[] scenes;
    scenes = new Scenes[30];
    
    scenes[0] = new Scenes();
    
    scenes[SceneType.start.ordinal()].setWelcomeMessage("We are going to have a great adventure!");
    scenes[SceneType.start.ordinal()].setHappinessFactor(0);  // no change for start

    scenes[SceneType.mcDonald.ordinal()].setWelcomeMessage("Would you like fries with that?");
    scenes[SceneType.mcDonald.ordinal()].setHappinessFactor(10);  // Increases happiness
  
        return scenes;
 
}
private static Questions[] createQuestions(){
        
        Questions[] questions;
        questions = new Questions[29];
        
        questions[0] = new Questions();
        
        questions[QuestionType.start.ordinal()].setAskQuestion("Where would you like to go first?");
        
        
        return questions;
    
}
private static void assignQuestionsToScenes(Questions[] questions,Scenes[] scenes){
    
}

private static void assignScenesToLocations(Scenes[] scenes,Location[][] locations){
    
    
}
    
}
