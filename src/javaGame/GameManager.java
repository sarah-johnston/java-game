package javaGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import base.Background;
import base.SpriteManager;
import base.Background; 
import base.ColorBackground;

public class GameManager extends SpriteManager{

	public int gameStatus;
	public CharacterSprite character;
	
	//not sure whether character should be a sprite or an image really
	public GameManager(Background background, CharacterSprite character) {
		super(background);
		this.character = character;
	}
	
	@Override
	public void draw(Graphics g) {
		background.draw(g);
		g.setColor(Color.RED);
		g.drawString("Press SPACE to start a new Game", 50, 70);
		}
	}
