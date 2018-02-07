/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.Family_Trials_2.model;

/**
 *
 * @author krist
 */
public enum RandomEvents {
    
    positiveEvent1("free food", "plus happiness"),
    positiveEvent2("family game", "plus happiness"),
    positiveEvent3("discover short cut", "plus happiness + plus time"),
    negativeEvent1("flat tire", "minus happiness + minus time"),
    negativeEvent2("kids fight", "minus happiness"),
    negativeEvent3("illness", "minus happiness + minus time"),
    negativeEvent4("car overheats", "minus happiness + minus time"),
    negativeEvent5("speeding ticket", "minus happiness + minus time + minus Money");
    
    // class instances
    private String eventType;
    private String eventDescription;
    
    RandomEvents(String eventType, String eventDescription){
        this.eventType = eventType;
        this.eventDescription = eventDescription;
}

    public String getEventType() {
        return eventType;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    @Override
    public String toString() {
        return "Events{" + "eventType=" + eventType + ", eventDescription=" + eventDescription + '}';
    }

    
    
}
