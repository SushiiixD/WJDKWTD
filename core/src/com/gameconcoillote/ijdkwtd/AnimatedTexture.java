package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import org.omg.CORBA.Current;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class AnimatedTexture 
{
	private ArrayList<Texture> textures = new ArrayList<Texture>();
	private int t;
	
	public AnimatedTexture(Texture t)
	{
		this.textures.add(t);
		this.t=0;
		
	}
	
	public void update()
	{
		
		try
		{
			Thread.sleep(500);
		
			this.t++;
			if(this.t >= textures.size()) this.t=0;
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		
	
	}
	
	public Texture getCurrentTexture()
	{
		return this.textures.get(t);
	}
	
	public void addTexture(Texture tex)
	{
		this.textures.add(tex);
	}
}
