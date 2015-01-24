package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.Input;


import com.badlogic.gdx.InputProcessor;


public class ijdkwtd extends Game implements InputProcessor{
	Screen inGameScreen;
	private ArrayList<Entity> entities = new  ArrayList<Entity>();
	//private Player player = new Player();
    //main game loop time
    private int dt;
    private Player player;
    
    @Override
    public void create () {
        inGameScreen = new InGameScreen();
        this.setScreen(inGameScreen);
        //Player player = new Player();
      
        this.player = new Player();
        entities.add(this.player);
        

        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render()
    {       
    	
    	this.dt =(int)(System.currentTimeMillis() - this.dt);
        super.render();
        
        for(Entity e: entities)
        {
        	e.update(this.dt);
        	e.draw();
        }
        
        this.dt = (int)System.currentTimeMillis();
       

        
    }

    @Override
    public boolean keyDown(int keycode) {
    	
    	switch(keycode)
    	{
    	case Keys.RIGHT:
    		this.player.move(700, 0);
    		break;
    		
    	case Keys.LEFT:
    		this.player.move(-700, 0);
    		break;
    		
    	default:
    		break;
    	}
    	
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
    	
    	switch(keycode)
    	{
    	case Keys.RIGHT:
    		this.player.move(0, 0);
    		break;
    		
    	case Keys.LEFT:
    		this.player.move(0, 0);
    		break;
    		
    	case Keys.A:
    		this.player.changeAnimation(0);;
    		break;
    		
    	case Keys.Z:
    		this.player.changeAnimation(1);;
    		break;
    		
    	default:
    		break;
    	}
    	
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        //System.out.println("Key pressed: " + character);
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        //System.out.println("Mouse coords:" + screenX + " " + screenY);
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
