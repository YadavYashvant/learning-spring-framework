package com.yadavyashvant.learningspringframework;

import com.yadavyashvant.learningspringframework.game.GameRunner;
import com.yadavyashvant.learningspringframework.game.MarioGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.runGame();
    }
}
