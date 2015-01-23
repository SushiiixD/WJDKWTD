package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;


public class ijdkwtd extends Game{
	Screen inGameScreen;
	private ArrayList<Entity> entities = new  ArrayList<Entity>();
    @Override
    public void create () {
        inGameScreen = new InGameScreen();
        this.setScreen(inGameScreen);
        
        // for testing entities movement !
        /*Texture img = new Texture(Gdx.files.internal("badlogic.jpg"));
        Entity abc = new Entity(img);
        abc.move(10,5);
        entities.add(abc);*/
        
        Player p = new Player();
        entities.add(p);
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

        if(Gdx.input.isTouched()) {
            try {
                Thread.sleep(200);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Mouse: x=" + Gdx.input.getX() + " y=" + Gdx.input.getY());
        }
    }
        
        	/*@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}*/
}
