package com.skazki96.kolobok.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.skazki96.kolobok.MyGdxGame;

//import sun.rmi.runtime.Log;

import static com.skazki96.kolobok.MyGdxGame.MAXIM_LOG;
import static com.skazki96.kolobok.MyGdxGame.VENS_LOG;


public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MyGdxGame(), config);
		System.out.println(MAXIM_LOG + " desktop is running");
		System.out.println(VENS_LOG + " running");
	}
}
