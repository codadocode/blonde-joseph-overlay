package br.com.narebastudio.blonde;

import br.com.narebastudio.blonde.conection.TwitchConection;
import br.com.narebastudio.blonde.conection.TwitchInfo;
import br.com.narebastudio.blonde.controller.Controller;
import br.com.narebastudio.blonde.personagem.BlondeJoseph;
import br.com.narebastudio.blonde.personagem.BlondeSoundSource;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Audio;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import javafx.scene.control.PasswordField;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import static com.badlogic.gdx.Gdx.audio;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	TwitchInfo accountInfo;
	TwitchConection twitchConection;
	BlondeJoseph blonde;
	Controller controller;
	Texture personagensTex;
	Music somTest;
	@Override
	public void create () {
		//region Dados Sensíveis
		accountInfo = enterStreamKey();
		loadTextures();
		batch = new SpriteBatch();
		blonde = new BlondeJoseph(personagensTex, new Vector2(180,180), 0, 0, 128, 128, 1,1);
		controller = new Controller();
		controller.setBlonde(blonde);
		loadSounds();
		//endregion
		twitchConection = new TwitchConection("irc.chat.twitch.tv", 6667, controller);
		try {
			twitchConection.connect(accountInfo.getApiKey(), accountInfo.getUsername(), accountInfo.getChannel());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		try   {
			twitchConection.readChat();
			blonde.update();
		}catch (Exception e)   {

		}
		draw();
	}
	public void draw()   {
		batch.begin();
		blonde.desenhar(batch);
		batch.end();
	}
	@Override
	public void dispose () {
		batch.dispose();
	}
	public void loadTextures()   {
		if (!BlondeSoundSource.is2077)    {
			personagensTex = new Texture("sprites/blonde_joseph_spritesheet.png");
		}else   {
			personagensTex = new Texture("sprites/blonde_joseph_2077_spritesheet.png");
		}
	}
	public void loadSounds()   {
		BlondeSoundSource.loadSounds();
	}
	public TwitchInfo enterStreamKey()   {
		JPanel keyPanel = new JPanel();
		JLabel label = new JLabel("Oauth");
		JPasswordField keyLabel = new JPasswordField(20);
		JLabel usernameLabel = new JLabel("Username");
		JTextField usernameField = new JTextField(20);
		Checkbox checkBox2077 = new Checkbox("2077?");
		keyPanel.add(checkBox2077);
		keyPanel.add(usernameLabel);
		keyPanel.add(usernameField);
		keyPanel.add(label);
		keyPanel.add(keyLabel);
		String options[] = {"OK", "Cancel"};
		int option = JOptionPane.showOptionDialog(null, keyPanel, "Insert Twitch Oauth Code", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
		if (option == 0)   {
			if (keyLabel.getPassword().length > 0 && usernameField.getText().length() > 0)   {
				String oauthKey = new String(keyLabel.getPassword());
				String username = usernameField.getText();
				TwitchInfo accountInfo = new TwitchInfo(username, oauthKey, username);
				BlondeSoundSource.is2077 = checkBox2077.getState();
				return accountInfo;
			}else   {
				//Pop Up Errado
			}
		}
		return null;
	}
}
