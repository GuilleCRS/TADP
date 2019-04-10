package NaveAnima;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Nave {
	private String nave="src//NaveAnima//avion.png";
	
	private int dx, dy, x, y;
	
	private Image imagen;
	
	public Nave() {
		x=40;
		y=60;
		ImageIcon img=new ImageIcon(this.getClass().getResource("avion.png"));
		imagen=img.getImage();
	}
	
	public void mover() {
		x+=dx;
		y+=dy;
	}

	public String getNave() {
		return nave;
	}

	public void setNave(String nave) {
		this.nave = nave;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}
	
	public void keyPressed(KeyEvent e) {
		int key=e.getKeyCode();
		
		if(key==KeyEvent.VK_LEFT) {
			dx=-3;
		}
		
		if(key==KeyEvent.VK_RIGHT) {
			dx=3;
		}
		
		if(key==KeyEvent.VK_UP) {
			dy=-2;
		}
		
		if(key==KeyEvent.VK_DOWN) {
			dy=2;
		}		
	}
	
	public void keyReleased(KeyEvent e) {
		int key=e.getKeyCode();
		
		if(key==KeyEvent.VK_LEFT) {
			dx=0;
		}
		
		if(key==KeyEvent.VK_RIGHT) {
			dx=0;
		}
		
		if(key==KeyEvent.VK_UP) {
			dy=0;
		}
		
		if(key==KeyEvent.VK_DOWN) {
			dy=0;
		}
	}
}
