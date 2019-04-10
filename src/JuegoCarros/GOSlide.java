package JuegoCarros;

import java.awt.Image;

import javax.swing.ImageIcon;

public class GOSlide extends Thread {
	ImageIcon gameo=new ImageIcon(this.getClass().getResource("gameover.png"));
	Image imagen=gameo.getImage();
    private String carro="blanco.png";
	
	private int dx, dy, x, y;
	
	public void run() {
		while(true) {
			x++;
			try {
				Thread.sleep(9);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
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

}
