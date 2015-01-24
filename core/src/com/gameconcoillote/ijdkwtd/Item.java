package com.gameconcoillote.ijdkwtd;

import com.badlogic.gdx.graphics.Texture;

//an item is an entity which have a specific behavior when used
//ex: a switch or a door etc
public abstract class Item extends Entity
{
	public Item(Texture t)
	{
		super(t);
	}
	
	public Item(Texture t,int x,int y)
	{
		super(t,x,y);
	}
	
	//define the behavior of the item when activated
	public abstract void activate();
}
