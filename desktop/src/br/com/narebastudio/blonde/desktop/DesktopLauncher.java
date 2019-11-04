package br.com.narebastudio.blonde.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import br.com.narebastudio.blonde.MainGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 360;
		config.height = 360;
		config.title = "Blonde Joseph Stream Overlay";
		config.resizable = false;
		new LwjglApplication(new MainGame(), config);
	}
}
