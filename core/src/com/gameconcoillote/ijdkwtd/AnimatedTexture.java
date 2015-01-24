package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import org.omg.CORBA.Current;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class AnimatedTexture implements Runnable
{
	private ArrayList<Texture> textures = new ArrayList<Texture>();//all the frame
	private int t;//index of the current frame (t as Time)
	private Thread thread = new Thread(this);
	private int delay;//delay between two frame
	
	public AnimatedTexture(Texture t,int delay)
	{
		this.textures.add(t);
		this.t=0;
		this.delay = delay;
		this.thread.start();
		
	}
	

	
	public AnimatedTexture(Texture t)
	{
		this(t,100);
	
		
	}
	
	public void update()
	{
		
		try
		{
			this.thread.sleep(this.delay);
		
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

	@Override
	public void run() {
		while(true)
		{
			update();
		}
		
	}
}
