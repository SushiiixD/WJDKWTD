package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Entity
{

	//the box around the entity
	private Rectangle box;
	//the picture of the entity
	protected ArrayList<AnimatedTexture> textures = new ArrayList<AnimatedTexture>();
	//the current animation
	protected int currentAnim;
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
		this.textures .add(new AnimatedTexture(t));
		this.currentAnim = 0;
		this.sprite = new SpriteBatch();
		this.box = new Rectangle(x,y,0,0);
		this.speed = new Vector2(5,5);//default speed of 5px/s
		this.move = new Vector2(0,0);
		
	}
	
	//draw the entity on the screen
	public void draw()
	{
		sprite.begin();
		sprite.draw(this.textures.get(this.currentAnim).getCurrentTexture(), box.x, box.y);
		sprite.end();
	}
	
	//move the entity of Xpx et Ypx per seconds
	public void move(int x, int y)
	{
		this.move.x = x;
		this.move.y = y;
	}
	
	
	public void update(int dt)
	{
		//compute the speed  considering the gameloop
		if(dt < 1000)//avoid dt error (if too big it will cause bugs)
		{
			this.box.x += (this.move.x * dt)/1000;
			this.box.y += (this.move.y * dt)/1000;
			
			System.out.println((this.move.x * dt)/1000 + " " + dt);
		}
		
	}
	
	public void changeAnimation(int animIndex)
	{
		if(animIndex < this.textures.size())
		{
			this.currentAnim = animIndex;
		}
		
	}
	
	public AnimatedTexture getAnim(int animIndex)
	{
		return this.textures.get(animIndex);
	}
	
	public void addTextureInAnim(Texture t,int animIndex)
	{
		if(animIndex < this.textures.size())
		{
			this.textures.get(animIndex).addTexture(t);
		}
		else//in case we try to access to a none definited animation
		{
			this.textures.add(new AnimatedTexture(t));
		}
	}
	
	
	public Vector2 getPosition()
	{
		return new Vector2(box.x,box.y);
	}
	
	
}
