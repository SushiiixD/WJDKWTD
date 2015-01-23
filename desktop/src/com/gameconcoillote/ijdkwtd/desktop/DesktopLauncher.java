package com.gameconcoillote.ijdkwtd.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gameconcoillote.ijdkwtd.ijdkwtd;


public class DesktopLauncher {
	
	public final static int WIDTH = 1024;
	public final static int HEIGHT = 768;

	
	
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="GAME JAM: IJDKWIAD";
		config.width=WIDTH;
		config.height=HEIGHT;
		new LwjglApplication(new ijdkwtd(), config);


		
		
	}
}
