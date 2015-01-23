package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class InGameScreen implements Screen{
 
    private SpriteBatch batch;
    private BitmapFont font;
    
    ArrayList<Entity> entities = new ArrayList<Entity>();
    @Override
    public void render(float delta) {
         
        Gdx.gl.glClearColor(0,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);        
        batch.begin();
        font.draw(batch, "Bienvenue dans WJDKWTD",50,Gdx.graphics.getHeight()-50);
        batch.end();  
        
        
        for(Entity e: entities)
        {
        	e.update();
        	e.draw();
        }
    }
     
    @Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void show() {
        batch = new SpriteBatch();
        font = new BitmapFont();
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

