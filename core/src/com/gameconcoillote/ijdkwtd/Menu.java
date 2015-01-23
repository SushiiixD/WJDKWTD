package com.gameconcoillote.ijdkwtd;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by Sonia on 23/01/2015.
 */

public class Menu implements Screen{

    ijdkwtd game;// Instance de MyGame pour accéder aux méthodes intéressantes pour changer d'écran

    public Menu(ijdkwtd g) {// Le constructeur
        game = g;
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0.2f, 0.4f, 1); // Notre jolie couleur rose :p
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.app.log("Menu", "Dans le menu rose");// On affiche dans la log que l'on soit bien dans notre menu
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
    }

}
