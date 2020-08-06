package com.xu.dino;
import java.util.Random;
public class LivingObject {
	public static final int LIFE = 0;
	public static final int DEAD = 1;
	public static final int STOP = 2;
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	protected int state = LIFE;
	

	public LivingObject(int width,int height,int x,int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	public LivingObject(int width,int height) {
		this.width = width;
		this.height = height;
		Random rand = new Random();
		this.x = rand.nextInt(World.WIDTH);
		this.y = World.HEIGHT - this.height;
	}
	public void step() {
		System.out.println("�����ƶ���");
	}
	
	public boolean isLife() {
		return state == LIFE;
	}
	
	public boolean isDead() {
		return state == DEAD;
	}
	
	public boolean isStop() {
		return state == STOP;
	}
}
