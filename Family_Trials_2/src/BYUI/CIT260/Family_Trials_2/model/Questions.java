/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.Family_Trials_2.model;

/**
 *
 * @author Katrina
 */
public class Questions {
    
    public Questions(){
        
    }
    
    private QuestionType questionType;
    private String askQuestion;

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getAskQuestion() {
        return askQuestion;
    }

    
    public Questions(QuestionType inQuestionType){
        this.questionType = inQuestionType;
    }

    public QuestionType getSceneType() {
        return questionType;
    }

    public void setSceneType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public void setAskQuestion(String askQuestion) {
        this.askQuestion = askQuestion;
    }
    
}
