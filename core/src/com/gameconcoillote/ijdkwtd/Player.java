package com.gameconcoillote.ijdkwtd;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Player extends Entity
{

	public Player() {
		this(0,0);
		
	}
	
	public Player(int x,int y)
	{
		super(new Texture(Gdx.files.internal("Sammy2.png")),x,y);
		
		this.texture.addTexture(
				new Texture(Gdx.files.internal("Ghost_Character.png"))
				);
		this.move(1,0);
	}
	
}
