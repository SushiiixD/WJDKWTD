
package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;

public class ijdkwtd extends Game
{
	
	Screen inGameScreen;
	//contain all the displayable an updatable objects
	private ArrayList<Entity> entities = new  ArrayList<Entity>();
	
	
    @Override
    public void create()
    {
        inGameScreen = new InGameScreen();
        this.setScreen(inGameScreen);
        // for testing
        /*Texture img = new Texture(Gdx.files.internal("badlogic.jpg"));
        Entity abc = new Entity(img);
        abc.move(10,5);
        entities.add(abc);*/
    }

    @Override
    public void render()
    {       
        super.render();
        
        for(Entity e: entities)
        {
        	e.update();
        	e.draw();
        }
    }
}

