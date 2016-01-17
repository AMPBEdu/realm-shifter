package io.bueidesoftware.realmshifter;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import io.bueidesoftware.realmshifter.game.WorldController;
import io.bueidesoftware.realmshifter.game.WorldRenderer;

public class RealmShifterMain extends ApplicationAdapter {
	WorldController worldController;
	WorldRenderer worldRenderer;
	
	SpriteBatch batch;
	Texture img;
	
	private boolean paused;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		
		// Set Libgdx log level to DEBUG
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		// Initialize controller and renderer
		worldController = new WorldController();
		worldRenderer = new WorldRenderer(worldController);
		
		paused = false;
	}

	@Override
	public void render () {
		if(!paused){
		worldController.update(Gdx.graphics.getDeltaTime());
		}
		Gdx.gl.glClearColor(0, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		worldRenderer.render();
		/*
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();*/
	}
	
	@Override public void resize(int width, int height){
		//worldRenderer.resize(width, height);
	}
	
	@Override public void pause(){
		//paused = true;
	}
	
	@Override public void resume(){
		paused = false;
	}
	
	@Override public void dispose(){
		worldRenderer.dispose();
	}
	
}
