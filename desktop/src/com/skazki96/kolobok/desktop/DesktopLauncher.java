package com.skazki96.kolobok.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.skazki96.kolobok.KolobokGame;

//import sun.rmi.runtime.Log;

import static com.skazki96.kolobok.KolobokGame.MAXIM_LOG;
import static com.skazki96.kolobok.KolobokGame.VENS_LOG;


public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = KolobokGame.APP_NAME;
		config.width = 800;
		config.height = 480;

		new LwjglApplication(new KolobokGame(), config);

		System.out.println(MAXIM_LOG + " desktop is running");
		System.out.println(VENS_LOG + " running");
	}
}
