package com.gameconcoillote.ijdkwtd;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Entity
{

	private Rectangle box;
	private Texture texture;
	private SpriteBatch sprite;
	
	public Entity(Texture t)
	{
		this(t,0,0);
		
	}
	
	public Entity(Texture t,int x,int y)
	{
		this.texture = t;
		this.sprite = new SpriteBatch();
		this.box = new Rectangle(x,y,0,0);
		
	}
	
	//draw the entity on the screen
	public void draw()
	{
		sprite.begin();
		sprite.draw(this.texture, box.x, box.y);
		sprite.end();
	}
	
	
	public Vector2 getPosition()
	{
		return new Vector2(box.x,box.y);
	}
	
	
}
