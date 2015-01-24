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
		super(new Texture(Gdx.files.internal("animWalk/Walk-Character1.png")),x,y);
		
		this.texture.addTexture(new Texture(Gdx.files.internal("animWalk/Walk-Character2.png")));
		this.texture.addTexture(new Texture(Gdx.files.internal("animWalk/Walk-Character3.png")));
		this.texture.addTexture(new Texture(Gdx.files.internal("animWalk/Walk-Character3-2.png")));
		this.texture.addTexture(new Texture(Gdx.files.internal("animWalk/Walk-Character3-3.png")));
		this.texture.addTexture(new Texture(Gdx.files.internal("animWalk/Walk-Character4.png")));
		this.texture.addTexture(new Texture(Gdx.files.internal("animWalk/Walk-Character5.png")));
		this.texture.addTexture(new Texture(Gdx.files.internal("animWalk/Walk-Character5-1.png")));
		
		this.move(700,0);
	}
	
}
