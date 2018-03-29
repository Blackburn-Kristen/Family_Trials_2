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
public class Scenes {
    
    public Scenes(){
        
    }
    private SceneType sceneType;
    private String welcomeMessage;
    private int happinessFactor;

    public int getHappinessFactor() {
        return happinessFactor;
    }

    public void setHappinessFactor(int happinessFactor) {
        this.happinessFactor = happinessFactor;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public Scenes(SceneType inSceneType){
        this.sceneType = inSceneType;
    }

    public SceneType getSceneType() {
        return sceneType;
    }

    public void setSceneType(SceneType sceneType) {
        this.sceneType = sceneType;
    }
    
//    private String createScene;
//
//    public void setCreateScene(String createScene) {
//        this.createScene = createScene;
//    }
}
