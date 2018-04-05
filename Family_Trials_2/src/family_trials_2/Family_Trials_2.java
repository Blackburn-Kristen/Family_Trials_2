/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family_trials_2;

import BYUI.CIT260.FamilyTrial2.View.StartProgramView;
import BYUI.CIT260.Family_Trials_2.model.Game;
import BYUI.CIT260.Family_Trials_2.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author krist
 */
public class Family_Trials_2 {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        try{
//            input = new BufferedReader(new InputStreamReader(System.in));
//            output = new PrintWriter(System.out, true);
//            logFile = new PrintWriter("logFile.txt");
//        }
        
        try{
            Family_Trials_2.inFile = new BufferedReader(new InputStreamReader(System.in));
            Family_Trials_2.outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");
        
      StartProgramView startProgramView = new StartProgramView();
      startProgramView.displayStartProgramView();
      return;
      }
        catch (Throwable e){
            System.out.println("Exception: " + e.toString() + "\nCause: "
            + e.getCause() + "\nMessage: " + e.getMessage());
            
            e.printStackTrace();
        }
        
        finally{
            try {
                if(Family_Trials_2.inFile !=null)
                Family_Trials_2.inFile.close();
                
                if(Family_Trials_2.outFile != null)
                 Family_Trials_2.outFile.close();
                
                if(logFile != null){
                    logFile.close();
                }
            } 
            catch (IOException ex) {
                System.out.println("unable to close file");
            }
   
        }
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Family_Trials_2.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Family_Trials_2.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Family_Trials_2.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInfile(BufferedReader infile) {
        Family_Trials_2.inFile = infile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Family_Trials_2.logFile = logFile;
    }
    
    
}
    

