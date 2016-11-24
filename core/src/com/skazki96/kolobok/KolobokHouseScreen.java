package com.skazki96.kolobok;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by User on 024 24.11.16.
 */

class KolobokHouseScreen implements Screen {

    final KolobokGame game;
    OrthographicCamera camera;
    SpriteBatch batch;
    Texture kolobokImg;
    Music houseMusic;
    Rectangle kolobok;


    public KolobokHouseScreen(KolobokGame game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
        batch = new SpriteBatch();
        kolobokImg = new Texture("kolobok_img.png");
        houseMusic = Gdx.audio.newMusic(Gdx.files.internal("House.mp3"));
        houseMusic.setLooping(true);
        houseMusic.play();

        kolobok = new Rectangle();
        kolobok.x = 800/2 - 72/2;
        kolobok.y = 20;
        kolobok.width = 72;
        kolobok.height = 72;


    }

    @Override
    public void show() {

        houseMusic.play();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();

        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        game.batch.draw(kolobokImg, kolobok.x, kolobok.y);

        game.batch.end();

        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) kolobok.x -= 200 * Gdx.graphics.getDeltaTime();
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) kolobok.x += 200 * Gdx.graphics.getDeltaTime();

        if (kolobok.x < 0) kolobok.x = 0;
        if (kolobok.x > 800 - 72) kolobok.x = 800 - 72;

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
        kolobokImg.dispose();
        houseMusic.dispose();
    }
}
