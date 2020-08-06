package com.xu.dino;
import java.awt.image.BufferedImage;

public class Dino extends LivingObject {
	private int dinoIndex;
	
	private int speed;
	public Dino() {
		super(40,43,50,183);
		this.speed = 1;
		this.dinoIndex = 1;
		state = STOP;
	}
	
	/*
	 * ����
	 * @see com.xu.dino.LivingObject#step()
	 */
	public void step() {
		y += speed;
		System.out.println("��������");
	}
	
	public BufferedImage getImage() {
		if(isStop()) {
			return Images.dinos[2];
		}else if(isLife()) {
			return Images.dinos[dinoIndex++%2];
		}else if(isDead()) {
			return Images.dinos[3];
		}
		return null;
	}

}
