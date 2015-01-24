package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

public class InGameScreen implements Screen{
 
    
    private ArrayList<Entity> entities = new  ArrayList<Entity>();
	private ArrayList<Background> level = new  ArrayList<Background>();
	private Player player;

	
	    public InGameScreen()
	    {
	        //player
	        this.player = new Player();
	        entities.add(this.player);
	        
	        //background
	        level.add(new Background(new Texture(Gdx.files.internal("Background1.jpg"))));

	    }
	 
    @Override
    public void render(float delta)
    {
         
    	for(Background bg: this.level)
        {
        	bg.update((int)delta);
        	bg.draw();
        }
        
        for(Entity e: entities)
        {
        	e.update((int)delta);
        	e.draw();
        }

    }
     
    public Player getPlayer()
    {
    	return this.player;
    }
    
    @Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void show() {
		// TODO Auto-generated method stub
    }

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}

