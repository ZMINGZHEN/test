package com.xu.dino;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;


public class Images {
	public static BufferedImage[] dinos;
	public static BufferedImage scactus;
	public static BufferedImage mcactus;
	public static BufferedImage bcactus;
	public static BufferedImage cloud;
	public static BufferedImage[] birds;
	public static BufferedImage[] maps;
	
	static {
		dinos = new BufferedImage[4];
		dinos[2] = readImage("dino0.png");
		dinos[0] = readImage("dino1.png");
		dinos[1] = readImage("dino2.png");
		dinos[3] = readImage("dinoover.png");
		birds = new BufferedImage[2];
		birds[0] = readImage("bird1.png");
		birds[1] = readImage("bird2.png");
		scactus = readImage("scactus.png");
		mcactus = readImage("mcactus.png");
		bcactus = readImage("bcactus.png");
		cloud = readImage("yun.png");
		maps = new BufferedImage[3];
		maps[0] = readImage("map.png");
		maps[1] = readImage("map1.png");
		maps[2] = readImage("map2.png");
	
	}
	
	public static BufferedImage readImage(String fileName){
		try{
			BufferedImage img = ImageIO.read(LivingObject.class.getResource(fileName));
			return img;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
