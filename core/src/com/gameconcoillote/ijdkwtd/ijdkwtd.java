package com.gameconcoillote.ijdkwtd;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class ijdkwtd extends Game{
	Screen inGameScreen;
	
    @Override
    public void create () {
        inGameScreen = new InGameScreen();
        this.setScreen(inGameScreen);
    }

    @Override
    public void render () {       
        super.render();
    }
}
