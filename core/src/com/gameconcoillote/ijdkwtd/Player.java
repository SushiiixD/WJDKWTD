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
		super(new Texture(Gdx.files.internal("anim_wait_mini/wait1.png")),x,y);
		
		//iddle
		
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_wait_mini/wait1.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_wait_mini/wait2.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_wait_mini/wait3.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_wait_mini/wait4.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_wait_mini/wait5.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_wait_mini/wait6.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_wait_mini/wait7.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_wait_mini/wait8.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_wait_mini/wait9.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_wait_mini/wait10.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_wait_mini/wait11.png")),0);
		super.getAnim(0).setDelay(500);
		
		//walk right
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk1.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk2.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk3.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk4.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk5.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk6.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk7.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk8.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk9.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk10.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk11.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk12.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk13.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk14.png")),1);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_right_mini/Walk15.png")),1);
		

		
		//walk left
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk1.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk2.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk3.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk4.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk5.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk6.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk7.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk8.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk9.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk10.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk11.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk12.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk13.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk14.png")),2);
		super.addTextureInAnim(new Texture(Gdx.files.internal("anim_walk_left_mini/Walk15.png")),2);
		
		//nope
		/*super.addTextureInAnim(new Texture(Gdx.files.internal("nope1.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("nope2.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("nope3.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("nope4.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("nope5.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("nope6.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("nope7.png")),0);
		super.addTextureInAnim(new Texture(Gdx.files.internal("nope8.png")),0);*/
		
		
	}
	
}
