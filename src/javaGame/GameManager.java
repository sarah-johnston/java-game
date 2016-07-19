package javaGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import base.Background;
import base.SpriteManager;
import base.ColorBackground;

public class GameManager extends SpriteManager{

	public int gameStatus;
	
	public GameManager(Background background, Image character) {
		super(background);
	}
	
	@Override
	public void draw(Graphics g) {
		background.draw(g);
		g.setColor(Color.RED);
		g.drawString("Press SPACE to start a new Game", 50, 70);
		break;
		}
	}
	
}
