package javaGame;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.io.File;

import javax.swing.ImageIcon;

import base.ColorBackground;
import javaGame.GameManager;

public class JavaGame extends Applet {
	
	private GameManager gm;
	private CharacterSprite character;
	private Image background;

	public void createManager() {
		// Create and add the sprites
		gm = new GameManager(new ColorBackground(this, Color.BLACK), character);
	}
	
	@Override
	public void init(){
		setSize(500, 500);
		//background = new ImageIcon(getCodeBase() + "resources" + File.separator + "octopus-icon.png").getImage();
		String path = getCodeBase() + "..\\resources\\octopus-icon.png";
		
		//Works with the hardcoded path so there must be a way to sort this out
//		background = new ImageIcon("C:\\Users\\Sarah\\Documents\\04.Making things\\Java Game\\Workspace\\java-game\\resources\\octopus-icon.png").getImage();
		background = new ImageIcon(path).getImage();
	}
	
	@Override
	public void start(){
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, 200, 84, null);
//		g.setColor(Color.green);
//		g.fillRect(0, 0, getSize().width, getSize().height);

		
		
		//need to set the colour before drawing each new thing.		
		g.setColor(Color.black);
		g.drawString("Hello Sarah!", 25, 30);
	}
	
}
