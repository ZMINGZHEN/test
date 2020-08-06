package com.xu.dino;
import java.awt.image.BufferedImage;

public class Desert extends LivingObject {
	private int speed;
	public Desert() {
		super(World.WIDTH,World.HEIGHT,0,163);
		state = STOP;
	}
	
	public BufferedImage getImage() {
		if(isStop()) {
			return Images.maps[2];
		}else {
			return Images.maps[1];
		}
	}
}
