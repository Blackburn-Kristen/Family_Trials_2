/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;

import family_trials_2.Family_Trials_2;
import java.io.PrintWriter;

/**
 *
 * @author krist
 */
public class ErrorView {
    private static PrintWriter console = Family_Trials_2.getOutFile();
    private static PrintWriter log = Family_Trials_2.getLogFile();
    
public static void display(String className, String errorMessage){
    
    console.println(
    "\n-----ERROR -----------------------------------------"
    + "\n" + errorMessage
    + "\n---------------------------------------------------");
    
    log.printf("%n%n%s", className + "-" + errorMessage);
}

}
