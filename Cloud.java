package com.xu.dino;
import java.awt.image.BufferedImage;

public class Cloud extends LivingObject {
	private int speed;
	public Cloud(int x,int y) {
		super(41,11,x,y);
		this.speed = 1;
		this.state = STOP;
	}
	
	public BufferedImage getImage() {
		if(isStop()) {
			return Images.cloud;
		}
		return null;
	}
}
