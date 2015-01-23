
package com.gameconcoillote.ijdkwtd;

import java.util.ArrayList;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class ijdkwtd extends Game {
	Screen inGameScreen;
	private ArrayList<Entity> entities = new ArrayList<Entity>();

	@Override
	public void create() {
		inGameScreen = new InGameScreen();
		this.setScreen(inGameScreen);
		setScreen(new Menu(this));
	}

	@Override
	public void render() {
		super.render();

		for (Entity e : entities) {
			e.update();
			e.draw();
		}
	}
}