package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;


public class ijdkwtd extends Game{
	Screen inGameScreen;
	private ArrayList<Entity> entities = new  ArrayList<Entity>();

    private int mouseTimer;
    private int mouseDelay;
    //main game loop time
    private int dt;
    
    @Override
    public void create () {
        inGameScreen = new InGameScreen();
        this.setScreen(inGameScreen);
        
        Player p = new Player();
        entities.add(p);
        
        this.mouseTimer = (int)System.currentTimeMillis();
        this.mouseDelay = 200;
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


        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT))
        {
        	
            
            if((int)(System.currentTimeMillis()) - this.mouseTimer > this.mouseDelay)
        	{
                System.out.println("Mouse: x=" + Gdx.input.getX() + " y=" + Gdx.input.getY());
               
                this.mouseTimer = (int)System.currentTimeMillis();
            }

        }
        
        this.dt = (int)System.currentTimeMillis();
       

        
    }
        
}
