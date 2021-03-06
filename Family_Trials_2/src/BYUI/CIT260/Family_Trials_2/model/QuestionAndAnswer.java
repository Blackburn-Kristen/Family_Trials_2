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
public class QuestionAndAnswer implements Serializable{
    //class instance varibles;
    private String quesion;
    private String answer; 
    private QuestionScene questionScene;

    public QuestionScene getQuestionScene() {
        return questionScene;
    }

    public void setQuestionScene(QuestionScene questionScene) {
        this.questionScene = questionScene;
    }
    

    public QuestionAndAnswer() {
    }

    
    
    public String getQuesion() {
        return quesion;
    }

    public void setQuesion(String quesion) {
        this.quesion = quesion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.quesion);
        hash = 71 * hash + Objects.hashCode(this.answer);
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionAndAnswer{" + "quesion=" + quesion + ", answer=" + answer + '}';
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
        final QuestionAndAnswer other = (QuestionAndAnswer) obj;
        if (!Objects.equals(this.quesion, other.quesion)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        return true;
    }
    
    
}
