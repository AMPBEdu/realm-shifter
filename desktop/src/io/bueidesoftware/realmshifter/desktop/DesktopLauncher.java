package io.bueidesoftware.realmshifter.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import io.bueidesoftware.realmshifter.RealmShifterMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new RealmShifterMain(), config);
		/*config.title = "jSeater - Seating people since 2016";
		config.width = 745;
		config.height = 568;*/
	}
}
