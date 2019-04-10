package JuegoCarros;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Carro1 extends Thread {
	
	private String carro="blanco.png";
	
	private int dx, dy, x, y;
	
	private Image imagen;
	boolean band=false;
	
	public Carro1() {
		x=660;
		y=601;
		ImageIcon img=new ImageIcon(this.getClass().getResource(carro));
		imagen=img.getImage();
	}
	
	public void mover() {
		if(x<563) {
			x=564;
			return;
		}
		if(x>750) {
			x=749;
			return;
		}
		x+=dx;
		y+=dy;
	}
	

	public String getNave() {
		return carro;
	}

	public void setNave(String nave) {
		this.carro = nave;
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
			dx=-10;
		}
		
		if(key==KeyEvent.VK_RIGHT) {
			dx=10;
		}
		if(key==KeyEvent.VK_A){
			dx=-10;
			
		}
		if(key==KeyEvent.VK_D){
			dx=10;
			
		}
		if(key==KeyEvent.VK_UP) {
			Carrohilo.setBoost(5);
		}
		if(key==KeyEvent.VK_DOWN) {
			Carrohilo.setBoost(-2);
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
		if(key==KeyEvent.VK_A){
			dx=0;
			
		}
		if(key==KeyEvent.VK_D){
			dx=0;
			
		}
		if(key==KeyEvent.VK_UP) {
			Carrohilo.setBoost(0);
		}
		if(key==KeyEvent.VK_DOWN) {
			Carrohilo.setBoost(0);
		}
	}
}