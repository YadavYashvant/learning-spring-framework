package com.yadavyashvant.learningspringframework.game;

public class GameRunner {

    MarioGame game;
    public GameRunner(MarioGame game){
        this.game = game;
    }

    public void runGame() {
        System.out.println("Runnin game: " + game + " ...");
    }
}
