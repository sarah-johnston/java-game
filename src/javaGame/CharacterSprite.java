package javaGame;

import java.awt.Component;
import java.awt.Image;
import java.awt.Point;

import base.Sprite;

public class CharacterSprite extends Sprite{

	
	public CharacterSprite(Component comp, Image img)
	  {
		// not quite sure what goes here, figure it out later
		super(comp, img, new Point(10, 10), new Point(0,0), 0, 0);
	  }
}
