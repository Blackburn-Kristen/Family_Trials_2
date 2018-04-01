/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrials2.exceptions;

/**
 *
 * @author Katrina
 */
public class StatusPercentControlException extends Exception {

    public StatusPercentControlException() {
    }

    public StatusPercentControlException(String string) {
        super(string);
    }

    public StatusPercentControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public StatusPercentControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public StatusPercentControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
