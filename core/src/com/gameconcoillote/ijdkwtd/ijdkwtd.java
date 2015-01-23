package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ijdkwtd extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	ArrayList<Entity> entities = new ArrayList<Entity>();
	

	@Override
	public void create () {
		img = new Texture("badlogic.jpg");
		Entity test = new Entity(img);
		entities.add(test);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		
		for(Entity e: this.entities)
		{
			e.draw();
		}
		
		
		
		

	}
}
