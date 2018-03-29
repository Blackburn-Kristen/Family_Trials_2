/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials2.control;

import BYUI.CIT260.Family_Trials_2.model.Inventory;
import BYUI.CIT260.Family_Trials_2.model.Location;
import BYUI.CIT260.Family_Trials_2.model.Map;
import BYUI.CIT260.Family_Trials_2.model.QuestionScene;
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
    
    scenes[SceneType.supplyShop.ordinal()].setWelcomeMessage("What supplies do you need?");
    scenes[SceneType.supplyShop.ordinal()].setHappinessFactor(0);  // Increases happiness
  
    scenes[SceneType.pitStop.ordinal()].setWelcomeMessage("Howdy, your tires could use some air.");
    scenes[SceneType.pitStop.ordinal()].setHappinessFactor(0);  // Increases happiness
    
    scenes[SceneType.wendys.ordinal()].setWelcomeMessage("What kind of Frosty would like, chocolate or vanilla?");
    scenes[SceneType.wendys.ordinal()].setHappinessFactor(10);  // Increases happiness
    
    scenes[SceneType.crackerBarrel.ordinal()].setWelcomeMessage("Yeeeeee-Ha!");
    scenes[SceneType.crackerBarrel.ordinal()].setHappinessFactor(15);  // Increases happiness
    
    scenes[SceneType.iHOP.ordinal()].setWelcomeMessage("It stands for International House of Pancakes, stop jumping.");
    scenes[SceneType.iHOP.ordinal()].setHappinessFactor(15);  // Increases happiness
    
    scenes[SceneType.gasStation.ordinal()].setWelcomeMessage("Don't forget to clean the bugs off the windows.");
    scenes[SceneType.gasStation.ordinal()].setHappinessFactor(0);  // Increases happiness
    
    scenes[SceneType.hotel.ordinal()].setWelcomeMessage("You're home away from home, complementary loud neighbors included.");
    scenes[SceneType.hotel.ordinal()].setHappinessFactor(25);  // Increases happiness
    
    scenes[SceneType.biggestBallOfYarn.ordinal()].setWelcomeMessage("...its yarn...lots and lots of yarn. Those poor sheep");
    scenes[SceneType.biggestBallOfYarn.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.earWaxMuseum.ordinal()].setWelcomeMessage("The Michael Jackson sculpture has a uncanny resemblence, everything else isn't as EAR-y");
    scenes[SceneType.earWaxMuseum.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.scariestButterFlyCollection.ordinal()].setWelcomeMessage("Thy're not as innocent as they look. Watch out for the Monstrous Monarchs!");
    scenes[SceneType.scariestButterFlyCollection.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.largestPairBoots.ordinal()].setWelcomeMessage("These boots were NOT made for walking.");
    scenes[SceneType.largestPairBoots.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.americansTiniestTown.ordinal()].setWelcomeMessage("The population is just one...its not actually filled with tiny people.");
    scenes[SceneType.americansTiniestTown.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.jackalopePettingZoo.ordinal()].setWelcomeMessage("They just glued antlers to rabbits. I think someone should call PETA");
    scenes[SceneType.jackalopePettingZoo.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.theThing.ordinal()].setWelcomeMessage("I just saw the Thing and I still have no clue what it is.");
    scenes[SceneType.theThing.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.area51.ordinal()].setWelcomeMessage("Everything was just fun and games till the probing started.");
    scenes[SceneType.area51.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.nuclearWasteAdventureTrail.ordinal()].setWelcomeMessage("Does growing a third arm count as a souvenir?");
    scenes[SceneType.nuclearWasteAdventureTrail.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.grandCanyon.ordinal()].setWelcomeMessage("It is a magestic hole in the ground.");
    scenes[SceneType.grandCanyon.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.mountRushmore.ordinal()].setWelcomeMessage("Trump's isn't on here yet and it is beautiful.");
    scenes[SceneType.mountRushmore.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.niagaraFalls.ordinal()].setWelcomeMessage("Where the water just keeps flowing...now I have to pee.");
    scenes[SceneType.niagaraFalls.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.goldenGateBridge.ordinal()].setWelcomeMessage("Its not actually made of gold, but still is pretty cool.");
    scenes[SceneType.goldenGateBridge.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.yellowStone.ordinal()].setWelcomeMessage("Old faithful is old and faithful just as promised.");
    scenes[SceneType.yellowStone.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.yosemiteNationalPark.ordinal()].setWelcomeMessage("Half Dome, yup it is here.");
    scenes[SceneType.yosemiteNationalPark.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.disneyWold.ordinal()].setWelcomeMessage("Where all your dreams come true...waiting in lines are a nightmare.");
    scenes[SceneType.disneyWold.ordinal()].setHappinessFactor(50);  // Increases happiness
    
    scenes[SceneType.statueOfLiberty.ordinal()].setWelcomeMessage("Why is she green? Red, white, and blue are the colors of FREEDOM!");
    scenes[SceneType.statueOfLiberty.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.bryceCanyon.ordinal()].setWelcomeMessage("Its a Canyon named after Bryce! Way to go Bryce!");
    scenes[SceneType.bryceCanyon.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.metropolitanMuseumOfArt.ordinal()].setWelcomeMessage("I feel so cultured now.");
    scenes[SceneType.metropolitanMuseumOfArt.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.instructions.ordinal()].setWelcomeMessage("If you are here you are lost.");
    scenes[SceneType.instructions.ordinal()].setHappinessFactor(0);  // Increases happiness
    
    scenes[SceneType.finish.ordinal()].setWelcomeMessage("Yay! Grandma's House! Yay Grandma!");
    scenes[SceneType.finish.ordinal()].setHappinessFactor(0);  // Increases happiness
    
        return scenes;
 
}
private static Questions[] createQuestions(){
        
        Questions[] questions;
        questions = new Questions[29];
        
        questions[0] = new Questions();
        
        questions[QuestionType.start.ordinal()].setAskQuestion("Where would you like to go first?");
        
        questions[QuestionType.goToPitStop.ordinal()].setAskQuestion("Would you like to take a Pit Stop?");
        
        questions[QuestionType.goToMcDonald.ordinal()].setAskQuestion("Would you like to go to McDonalds?");
        
        questions[QuestionType.goToWendys.ordinal()].setAskQuestion("Would you like to go to Wendys?");
        
        questions[QuestionType.goToCrackerBarrel.ordinal()].setAskQuestion("Would you like to go to Cracker Barrel?");
        
        questions[QuestionType.goToIHOP.ordinal()].setAskQuestion("Would you like to go to IHOP?");
        
        questions[QuestionType.goToGasStation.ordinal()].setAskQuestion("Would you like to stop at a Gas Station?");
        
        questions[QuestionType.goToHotel.ordinal()].setAskQuestion("Would you like to stay at a Hotel for the night?");
        
        questions[QuestionType.goToBiggestBallOfYarn.ordinal()].setAskQuestion("Would you like to visit the Biggest Ball of Yarn?");
        
        questions[QuestionType.goToEarWaxMuseum.ordinal()].setAskQuestion("Would you like to visit the Earwax Museum?");
        
        questions[QuestionType.goToScariestButterFlyCollection.ordinal()].setAskQuestion("Would you like to visit the Scariest Butterfly Collection?");
        
        questions[QuestionType.goToLargestPairBoots.ordinal()].setAskQuestion("Would you like to visit the Largest Pair of Boots?");
        
        questions[QuestionType.goToAmericansTiniestTown.ordinal()].setAskQuestion("Would you like to visit America's Tiniest Town?");
        
        questions[QuestionType.goToJackalopePettingZoo.ordinal()].setAskQuestion("Would you like to visit the Jackalope Petting Zoo?");
        
        questions[QuestionType.goToTheThing.ordinal()].setAskQuestion("Would you like to visit the THING?");
        
        questions[QuestionType.goToArea51.ordinal()].setAskQuestion("Would you like to visit Area 51?");
        
        questions[QuestionType.goToNuclearWasteAdventureTrail.ordinal()].setAskQuestion("Would you like to hike the Nuclear Waste Adventure Trail?");
        
        questions[QuestionType.goToGrandCanyon.ordinal()].setAskQuestion("Would you like to visit the Grand Canyon?");
        
        questions[QuestionType.goToMountRushmore.ordinal()].setAskQuestion("Would you like to visit Mount Rushmore?");
        
        questions[QuestionType.goToNiagaraFalls.ordinal()].setAskQuestion("Would you like to visit Niagara Falls?");
        
        questions[QuestionType.goToGoldenGateBridge.ordinal()].setAskQuestion("Would you like to visit the Golden Gate Bridge?");
        
        questions[QuestionType.goToYellowStone.ordinal()].setAskQuestion("Would you like to visit Yellowstone National Park?");
        
        questions[QuestionType.goToYosemiteNationalPark.ordinal()].setAskQuestion("Would you like to visit Yosemite National Park?");
        
        questions[QuestionType.goToDisneyWold.ordinal()].setAskQuestion("Would you like to visit DISNEY WORLD!!?");
                
        questions[QuestionType.goToStatueOfLiberty.ordinal()].setAskQuestion("Would you like to visit the Statue of Liberty?");
        
        questions[QuestionType.goToBryceCanyon.ordinal()].setAskQuestion("Would you like to visit Bryce Canyon?");
        
        questions[QuestionType.goToMetropolitanMuseumOfArt.ordinal()].setAskQuestion("Would you like to visit Metropolitan Museum of Art?");
        
        questions[QuestionType.getInstructions.ordinal()].setAskQuestion("Would you like to view the instructions?");
        
        questions[QuestionType.yayYouFinished.ordinal()].setAskQuestion("Would you like to visit Grandma's house?");
        
        return questions;
    
}
private static void assignScenesToLocations(Scenes[] scenes,Location[][] locations){
    
    locations[1][0].setScene(scenes[SceneType.start.ordinal()]); 
    locations[0][1].setScene(scenes[SceneType.supplyShop.ordinal()]);
    locations[0][2].setScene(scenes[SceneType.pitStop.ordinal()]);
    locations[0][3].setScene(scenes[SceneType.gasStation.ordinal()]);
    locations[0][4].setScene(scenes[SceneType.mcDonald.ordinal()]);
    
    
    
}
    
}
