package javaGame;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

import base.ColorBackground;
import javaGame.GameManager;

public class JavaGame extends Applet {
	
	private GameManager gm;
	private Image character;

	public void createManager() {
		// Create and add the sprites
		gm = new GameManager(new ColorBackground(this, Color.BLACK), character);
	}
	
	
	@Override
	public void paint(Graphics g) {
		gm.draw(g);
	}
	
}
