package com.gameconcoillote.ijdkwtd;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Entity
{

	private Vector2 pos;
	private Rectangle box;
	private Texture texture;
	private SpriteBatch sprite;
	
	public Entity(Texture t)
	{
		this.texture = t;
		this.sprite = new SpriteBatch();
		
	}
	
	public void draw()
	{
		sprite.begin();
		sprite.draw(this.texture, 0, 0);
		sprite.end();
	}
	public Vector2 getPosition()
	{
		return this.pos;
	}
	
	
}
