package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;


public class ijdkwtd extends Game implements InputProcessor{
	Screen inGameScreen;
	private ArrayList<Entity> entities = new  ArrayList<Entity>();
	private ArrayList<Background> level = new  ArrayList<Background>();
	private Player player;
	
    //main game loop time
    private int dt;
    
    
    @Override
    public void create () {
        inGameScreen = new InGameScreen();

        //player
        this.player = new Player();
        entities.add(this.player);
        
        //background
        level.add(new Background(new Texture(Gdx.files.internal("Background1.jpg"))));

        Gdx.input.setInputProcessor(this);
        
       
    }

    @Override
    public void render()
    {       
    	Gdx.graphics.getGL20().glClearColor( 1, 0, 0, 1 );
    	Gdx.graphics.getGL20().glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT );
    	  
    	this.dt =(int)(System.currentTimeMillis() - this.dt);
    	
        super.render();
        
        for(Background bg: this.level)
        {
        	bg.update(this.dt);
        	bg.draw();
        }
        
        for(Entity e: entities)
        {
        	e.update(this.dt);
        	e.draw();
        }
        
        
        
        this.dt = (int)System.currentTimeMillis();

        
    }

    @Override
    public boolean keyDown(int keycode)
    {
    	
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
    	
    
    	
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
    	this.player.move(screenX, screenY);
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
    	this.player.changeAnimation(0);
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
