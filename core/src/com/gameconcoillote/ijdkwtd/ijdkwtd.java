package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.Input;


import com.badlogic.gdx.InputProcessor;


public class ijdkwtd extends Game implements InputProcessor{
	Screen inGameScreen;
	private ArrayList<Entity> entities = new  ArrayList<Entity>();

    //private int mouseTimer;
    //private int mouseDelay;
    //main game loop time
    private int dt;
    
    @Override
    public void create () {
        inGameScreen = new InGameScreen();
        this.setScreen(inGameScreen);
        
        Player p = new Player();
        entities.add(p);
        
        //this.mouseTimer = (int)System.currentTimeMillis();
        //this.mouseDelay = 200;

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


        /*if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {


            if ((int) (System.currentTimeMillis()) - this.mouseTimer > this.mouseDelay) {
                //System.out.println("Mouse: x=" + Gdx.input.getX() + " y=" + Gdx.input.getY());

                this.mouseTimer = (int) System.currentTimeMillis();
            }
        }*/
        
        this.dt = (int)System.currentTimeMillis();
       

        
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        System.out.println("Key pressed: " + character);
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("Mouse coords:" + screenX + " " + screenY);
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
