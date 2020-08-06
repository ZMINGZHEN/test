package com.xu.dino;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class World extends JPanel {
	
	public static final int WIDTH = 483;
	public static final int HEIGHT = 286;
	private Dino dino = new Dino();
	private Desert desert = new Desert();
	private Cloud[] clouds = new Cloud[] {
			new Cloud(50,50),
			new Cloud(350,90),
			new Cloud(150,110)
	};

	
	public void paint(Graphics g) {
		g.drawImage(desert.getImage(),desert.x,desert.y,null);
		g.drawImage(dino.getImage(),dino.x,dino.y,null);
		for(int i=0;i<clouds.length;i++) {
			Cloud c = clouds[i];
			g.drawImage(c.getImage(),c.x,c.y,null);
		}
	}
	
	public void stepAction() {
		dino.step();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		World world = new World();
		frame.add(world);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true);  //1.���ô��ڿμ� 2.�������paint����
		world.stepAction();
	}
}
