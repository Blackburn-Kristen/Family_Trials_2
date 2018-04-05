/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials2.control;

import BYUI.CIT260.FamilyTrials2.exceptions.MapControlException;
import BYUI.CIT260.Family_Trials_2.model.Game;
import BYUI.CIT260.Family_Trials_2.model.Inventory;
import BYUI.CIT260.Family_Trials_2.model.Location;
import BYUI.CIT260.Family_Trials_2.model.Map;
import BYUI.CIT260.Family_Trials_2.model.QuestionScene;
import BYUI.CIT260.Family_Trials_2.model.QuestionType;
import BYUI.CIT260.Family_Trials_2.model.Questions;
import BYUI.CIT260.Family_Trials_2.model.SceneType;
import static BYUI.CIT260.Family_Trials_2.model.SceneType.start;
import BYUI.CIT260.Family_Trials_2.model.Scenes;
import BYUI.CIT260.Family_Trials_2.model.Vehicle;
import family_trials_2.Family_Trials_2;
import static family_trials_2.Family_Trials_2.getCurrentGame;
import java.util.ArrayList;
import javafx.scene.Scene;

/**
 *
 * @author Katrina
 */
public class MapControl {
    
    public MapControl(){
    }
    
    private Vehicle vehicle = null;
    
    public static Map createMap(int noOfRows, int noOfCol) throws MapControlException{
        
        if( noOfRows < 0 || noOfCol < 0 ){
            
            throw new MapControlException("Error Creatring Map.");
        }
        
       
       Map map =  new Map(noOfRows, noOfCol);
       Location[][] locations;
        locations = new Location[noOfRows][noOfCol];
               for( int i = 0; i < noOfRows; i++ ){
                   for(int j = 0; j < noOfCol; j++){
                      Location temp = new Location();
                      temp.setRow(i);
                      temp.setCol(j);
                      temp.setVisited(false);
                      locations[i][j] = temp;
                   }
               }
               map.setLocation(locations);
               
               Scenes[] scenes;
               scenes = new Scenes[27];
               scenes = createScenes();
               Questions[] questions;
               questions = new Questions[25];
               questions = createQuestions();
               
               assignScenesToLocations(scenes, locations);
               
        return map;
    }
    
   
private static Scenes[] createScenes(){
    
    Scenes[] scenes;
    scenes = new Scenes[27];
    
    for (int i = 0; i < 27; i++){
        scenes[i] = new Scenes();
        
    }
    
    scenes[SceneType.start.ordinal()].setWelcomeMessage("We are going to have a great adventure!");
    //scenes[SceneType.start.ordinal()].setHappinessFactor(0);  // no change for start

    scenes[SceneType.mcDonald.ordinal()].setWelcomeMessage("Would you like fries with that?");
    //scenes[SceneType.mcDonald.ordinal()].setHappinessFactor(10);  // Increases happiness
    
    scenes[SceneType.supplyShop.ordinal()].setWelcomeMessage("What supplies do you need?");
    //scenes[SceneType.supplyShop.ordinal()].setHappinessFactor(0);  // Increases happiness
  
    scenes[SceneType.pitStop.ordinal()].setWelcomeMessage("Howdy, your tires could use some air.");
    //scenes[SceneType.pitStop.ordinal()].setHappinessFactor(0);  // Increases happiness
   
    scenes[SceneType.iHOP.ordinal()].setWelcomeMessage("It stands for International House of Pancakes, stop jumping.");
    //scenes[SceneType.iHOP.ordinal()].setHappinessFactor(15);  // Increases happiness
    
    scenes[SceneType.gasStation.ordinal()].setWelcomeMessage("Don't forget to clean the bugs off the windows.");
    //scenes[SceneType.gasStation.ordinal()].setHappinessFactor(0);  // Increases happiness
    
    scenes[SceneType.hotel.ordinal()].setWelcomeMessage("You're home away from home, complementary loud neighbors included.");
    //scenes[SceneType.hotel.ordinal()].setHappinessFactor(25);  // Increases happiness
    
    scenes[SceneType.biggestBallOfYarn.ordinal()].setWelcomeMessage("...its yarn...lots and lots of yarn. Those poor sheep");
    //scenes[SceneType.biggestBallOfYarn.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.earWaxMuseum.ordinal()].setWelcomeMessage("The Michael Jackson sculpture has a uncanny resemblence, everything else isn't as EAR-y");
    //scenes[SceneType.earWaxMuseum.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.scariestButterFlyCollection.ordinal()].setWelcomeMessage("Thy're not as innocent as they look. Watch out for the Monstrous Monarchs!");
    //scenes[SceneType.scariestButterFlyCollection.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.largestPairBoots.ordinal()].setWelcomeMessage("These boots were NOT made for walking.");
    //scenes[SceneType.largestPairBoots.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.americansTiniestTown.ordinal()].setWelcomeMessage("The population is just one...its not actually filled with tiny people.");
    //scenes[SceneType.americansTiniestTown.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.jackalopePettingZoo.ordinal()].setWelcomeMessage("They just glued antlers to rabbits. I think someone should call PETA");
    //scenes[SceneType.jackalopePettingZoo.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.theThing.ordinal()].setWelcomeMessage("I just saw the Thing and I still have no clue what it is.");
    //scenes[SceneType.theThing.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.area51.ordinal()].setWelcomeMessage("Everything was just fun and games till the probing started.");
    //scenes[SceneType.area51.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.nuclearWasteAdventureTrail.ordinal()].setWelcomeMessage("Does growing a third arm count as a souvenir?");
    //scenes[SceneType.nuclearWasteAdventureTrail.ordinal()].setHappinessFactor(-10);  // Increases happiness
    
    scenes[SceneType.grandCanyon.ordinal()].setWelcomeMessage("It is a magestic hole in the ground.");
    //scenes[SceneType.grandCanyon.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.mountRushmore.ordinal()].setWelcomeMessage("Trump's isn't on here yet and it is beautiful.");
    //scenes[SceneType.mountRushmore.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.niagaraFalls.ordinal()].setWelcomeMessage("Where the water just keeps flowing...now I have to pee.");
    //scenes[SceneType.niagaraFalls.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.goldenGateBridge.ordinal()].setWelcomeMessage("Its not actually made of gold, but still is pretty cool.");
    //scenes[SceneType.goldenGateBridge.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.yellowStone.ordinal()].setWelcomeMessage("Old faithful is old and faithful just as promised.");
    //scenes[SceneType.yellowStone.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.yosemiteNationalPark.ordinal()].setWelcomeMessage("Half Dome, yup it is here.");
    //scenes[SceneType.yosemiteNationalPark.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.disneyWold.ordinal()].setWelcomeMessage("Where all your dreams come true...waiting in lines are a nightmare.");
    //scenes[SceneType.disneyWold.ordinal()].setHappinessFactor(50);  // Increases happiness
    
    scenes[SceneType.statueOfLiberty.ordinal()].setWelcomeMessage("Why is she green? Red, white, and blue are the colors of FREEDOM!");
    //scenes[SceneType.statueOfLiberty.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.bryceCanyon.ordinal()].setWelcomeMessage("Its a Canyon named after Bryce! Way to go Bryce!");
    //scenes[SceneType.bryceCanyon.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.metropolitanMuseumOfArt.ordinal()].setWelcomeMessage("I feel so cultured now.");
    //scenes[SceneType.metropolitanMuseumOfArt.ordinal()].setHappinessFactor(20);  // Increases happiness
    
    scenes[SceneType.finish.ordinal()].setWelcomeMessage("Yay! Grandma's House! Yay Grandma!");
    //scenes[SceneType.finish.ordinal()].setHappinessFactor(0);  // Increases happiness
    
        return scenes;
 
}
private static Questions[] createQuestions(){
        
        Questions[] questions;
        questions = new Questions[25];
        
         for (int i = 0; i < 25; i++){
        questions[i] = new Questions();
         }
         
        
        questions[QuestionType.goToPitStop.ordinal()].setAskQuestion("Would you like to take a Pit Stop?");
        
        questions[QuestionType.goToMcDonald.ordinal()].setAskQuestion("Would you like to go to McDonalds?");
        
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
        
        questions[QuestionType.yayYouFinished.ordinal()].setAskQuestion("Would you like to visit Grandma's house?");
        
        return questions;
    
}
private static void assignScenesToLocations(Scenes[] scenes,Location[][] locations){
    
    locations[1][0].setScene(scenes[SceneType.start.ordinal()]); 
    locations[0][1].setScene(scenes[SceneType.supplyShop.ordinal()]);
    locations[0][6].setScene(scenes[SceneType.pitStop.ordinal()]);
    locations[0][25].setScene(scenes[SceneType.mcDonald.ordinal()]);
    locations[0][21].setScene(scenes[SceneType.iHOP.ordinal()]);
    locations[0][3].setScene(scenes[SceneType.gasStation.ordinal()]);
    locations[0][14].setScene(scenes[SceneType.hotel.ordinal()]);
    locations[2][17].setScene(scenes[SceneType.biggestBallOfYarn.ordinal()]);
    locations[2][22].setScene(scenes[SceneType.earWaxMuseum.ordinal()]);
    locations[2][23].setScene(scenes[SceneType.scariestButterFlyCollection.ordinal()]);
    locations[2][2].setScene(scenes[SceneType.largestPairBoots.ordinal()]);
    locations[2][9].setScene(scenes[SceneType.americansTiniestTown.ordinal()]);
    locations[2][8].setScene(scenes[SceneType.jackalopePettingZoo.ordinal()]);
    locations[2][12].setScene(scenes[SceneType.theThing.ordinal()]);
    locations[2][13].setScene(scenes[SceneType.area51.ordinal()]);
    locations[2][16].setScene(scenes[SceneType.nuclearWasteAdventureTrail.ordinal()]);
    locations[2][10].setScene(scenes[SceneType.grandCanyon.ordinal()]);
    locations[2][15].setScene(scenes[SceneType.mountRushmore.ordinal()]);
    locations[2][18].setScene(scenes[SceneType.niagaraFalls.ordinal()]);
    locations[2][4].setScene(scenes[SceneType.goldenGateBridge.ordinal()]);
    locations[2][7].setScene(scenes[SceneType.yellowStone.ordinal()]);
    locations[2][5].setScene(scenes[SceneType.yosemiteNationalPark.ordinal()]);
    locations[2][24].setScene(scenes[SceneType.disneyWold.ordinal()]);
    locations[2][19].setScene(scenes[SceneType.statueOfLiberty.ordinal()]);
    locations[2][11].setScene(scenes[SceneType.bryceCanyon.ordinal()]);
    locations[2][20].setScene(scenes[SceneType.metropolitanMuseumOfArt.ordinal()]);
    locations[2][26].setScene(scenes[SceneType.finish.ordinal()]);
    
}

private static void assignQuestionToLocations(Questions[] questions,Location[][] locations){
    
    locations[1][6].setQuestion(questions[QuestionType.goToPitStop.ordinal()]);
    locations[1][25].setQuestion(questions[QuestionType.goToMcDonald.ordinal()]);
    locations[1][21].setQuestion(questions[QuestionType.goToIHOP.ordinal()]);
    locations[1][3].setQuestion(questions[QuestionType.goToGasStation.ordinal()]);
    locations[1][14].setQuestion(questions[QuestionType.goToHotel.ordinal()]);
    locations[1][17].setQuestion(questions[QuestionType.goToBiggestBallOfYarn.ordinal()]);
    locations[1][22].setQuestion(questions[QuestionType.goToEarWaxMuseum.ordinal()]);
    locations[1][23].setQuestion(questions[QuestionType.goToScariestButterFlyCollection.ordinal()]);
    locations[1][2].setQuestion(questions[QuestionType.goToLargestPairBoots.ordinal()]);
    locations[1][9].setQuestion(questions[QuestionType.goToAmericansTiniestTown.ordinal()]);
    locations[1][8].setQuestion(questions[QuestionType.goToJackalopePettingZoo.ordinal()]);
    locations[1][12].setQuestion(questions[QuestionType.goToTheThing.ordinal()]);
    locations[1][13].setQuestion(questions[QuestionType.goToArea51.ordinal()]);
    locations[1][16].setQuestion(questions[QuestionType.goToNuclearWasteAdventureTrail.ordinal()]);
    locations[1][10].setQuestion(questions[QuestionType.goToGrandCanyon.ordinal()]);
    locations[1][15].setQuestion(questions[QuestionType.goToMountRushmore.ordinal()]);
    locations[1][18].setQuestion(questions[QuestionType.goToNiagaraFalls.ordinal()]);
    locations[1][4].setQuestion(questions[QuestionType.goToGoldenGateBridge.ordinal()]);
    locations[1][7].setQuestion(questions[QuestionType.goToYellowStone.ordinal()]);
    locations[1][5].setQuestion(questions[QuestionType.goToYosemiteNationalPark.ordinal()]);
    locations[1][24].setQuestion(questions[QuestionType.goToDisneyWold.ordinal()]);
    locations[1][19].setQuestion(questions[QuestionType.goToStatueOfLiberty.ordinal()]);
    locations[1][11].setQuestion(questions[QuestionType.goToBryceCanyon.ordinal()]);
    locations[1][20].setQuestion(questions[QuestionType.goToMetropolitanMuseumOfArt.ordinal()]);
    locations[1][26].setQuestion(questions[QuestionType.yayYouFinished.ordinal()]);
    
}
   
/*public static Location moveActor(actor, newRow, newColumn) {
 if actor is null then
 throw MapControlException
 endIf
 game = get the currentGame in the main class
 map = get the map in the game object
 locations = get the locations in the map
 if (newRow < 1 OR newRow > noOfRows in map OR
 newColumn < 1 OR newColumn > noOfColumns in map) then
 throw MapControlException
 endIf
 currentRow = get the row from the actor
 currentColumn = get the column from the actor
 oldLocation = get the location from the locations
 array at the current row and column
 newLocation = get the location at the new row and column
 set actor in the oldLocation to null
 set actor in the newLocation to the actor
 set row in actor to newRow
 set column in actor to newColumn
 return newLocation
*/

public static Location MoveVehicle(Vehicle vehicle, int newRow, int newCol) throws MapControlException{
    
    if(vehicle == null){
        throw new MapControlException("Invalid Vehicle");
    }

    Game familyTrials2 = getCurrentGame(); 

    Map map = familyTrials2.getMap();
    
    if (newRow < 1 || newRow > map.getRowCount() || newCol < 1 || newCol > map.getColumnCount()){
        throw new MapControlException("Invalid map size");
    }
    
    int currentRow = map.getCurrentRow();
    int currentCol = map.getCurrentColumn();
    Location[][] location = map.getLocation();
    location[currentRow][currentCol].setVehicle(null);
    
    location[newRow][newCol].setVehicle(vehicle);
    
    map.setLocation(location);
    
    return location[currentRow][currentCol];
    }
}
   
