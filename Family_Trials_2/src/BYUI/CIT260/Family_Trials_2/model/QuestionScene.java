/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.Family_Trials_2.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Katrina
 */
public class QuestionScene extends Scenes implements Serializable{
    //class instance variable
    private String noToAnswer;
    private double addInventory;
    private Buying buying;
    private QuestionAndAnswer questionAndAnswer;

    public QuestionAndAnswer getQuestionAndAnswer() {
        return questionAndAnswer;
    }

    public void setQuestionAndAnswer(QuestionAndAnswer questionAndAnswer) {
        this.questionAndAnswer = questionAndAnswer;
    }
    
    

    public Buying getBuying() {
        return buying;
    }

    public void setBuying(Buying buying) {
        this.buying = buying;
    }
    
    

    public QuestionScene() {
    }
    
    
    
    public String getNoToAnswer() {
        return noToAnswer;
    }

    public void setNoToAnswer(String noToAnswer) {
        this.noToAnswer = noToAnswer;
    }

    public double getAddInventory() {
        return addInventory;
    }

    public void setAddInventory(double addInventory) {
        this.addInventory = addInventory;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.noToAnswer);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.addInventory) ^ (Double.doubleToLongBits(this.addInventory) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionScene{" + "noToAnswer=" + noToAnswer + ", addInventory=" + addInventory + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestionScene other = (QuestionScene) obj;
        if (Double.doubleToLongBits(this.addInventory) != Double.doubleToLongBits(other.addInventory)) {
            return false;
        }
        if (!Objects.equals(this.noToAnswer, other.noToAnswer)) {
            return false;
        }
        return true;
    }
    
    
}
