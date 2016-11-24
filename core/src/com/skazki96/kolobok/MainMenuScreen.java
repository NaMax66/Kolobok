package com.skazki96.kolobok;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;


/**
 * Created by User on 024 24.11.16.
 */

class MainMenuScreen implements Screen {

    private KolobokGame game;
    private OrthographicCamera camera;

    public MainMenuScreen(KolobokGame game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();

        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        game.font.draw(game.batch, KolobokGame.APP_NAME, 340, 450);
        game.font.draw(game.batch, "KOLOBOK PO RUSSKI", 320, 250);
        game.font.draw(game.batch, "Tap to start", 360, 100);
        game.batch.end();

        if (Gdx.input.isTouched()){
            game.setScreen(new KolobokHouseScreen(game));
            dispose();
        }

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
