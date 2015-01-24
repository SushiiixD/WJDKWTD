package com.gameconcoillote.ijdkwtd;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Entity
{

	//the box around the entity
	private Rectangle box;
	//the picture of the entity
	protected AnimatedTexture texture;
	//the sprite of the entity
	private SpriteBatch sprite;
	//max movement spped
	private Vector2 speed;
	//current movement speed
	private Vector2 move;
	
	public Entity(Texture t)
	{
		this(t,0,0);
		
	}
	
	public Entity(Texture t,int x,int y)
	{
		this.texture = new AnimatedTexture(t);
		
		this.sprite = new SpriteBatch();
		this.box = new Rectangle(x,y,0,0);
		this.speed = new Vector2(0,0);
		this.move = new Vector2(0,0);
		
	}
	
	//draw the entity on the screen
	public void draw()
	{
		sprite.begin();
		sprite.draw(this.texture.getCurrentTexture(), box.x, box.y);
		sprite.end();
	}
	
	public void move(int x, int y)
	{
		this.move.x = x;
		this.move.y = y;
	}
	
	
	public void update()
	{
		this.box.x += this.move.x;
		this.box.y += this.move.y;
		
		this.texture .update();
	}
	
	
	public Vector2 getPosition()
	{
		return new Vector2(box.x,box.y);
	}
	
	
}
