package JuegoCarros;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ImageIcon;

public class Carrohilo extends Thread {
	static int rand=0;
	String car;
	private int dx, dy, x=584, y=-90;
	static Random rnd=new Random();
	private Image imagen;
	private static int boost=0;
	private static int noboost=0;
	public static int getBoost() {
		return boost;
	}
	public static void setBoost(int boost) {
		Carrohilo.boost = boost;
	}
	public static int puntos=0;
	private static boolean []elem= {false,false,false};
	
	public void run() {
		selecarro();
		verfica();
		seleccicar();
		y=-80;
		while(true) {
			y=y+boost;
			if(puntos>100 && puntos <300) {
				y=y+1;
			}
			if(puntos>=300 && puntos <600) {
				y=y+2;
			}
			if(puntos>=600 && puntos <1000) {
				y=y+3;
			}
			if(puntos>=1000) {
				y=y+4;
			}
			y=y+3;
			if(y>700) {
				selecarro();
				puntos=puntos+5;;
				verfica();
				seleccicar();
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static int getNoboost() {
		return noboost;
	}
	public static void setNoboost(int noboost) {
		Carrohilo.noboost = noboost;
	}
	public void carril(int m) {
		switch(m) { 
		case 0:
			elem[m]=true;
			x=584;
			y=-80;
			break;
		case 1:
			elem[m]=true;
			x=660;
			y=-180;
			break;
		case 2:
			elem[m]=true;
			x=745;
			y=-280;
			break;
		}	
	}
	private void seleccicar() {
		int val=rnd.nextInt(3);
		if(elem[val]==false) {	
			carril(val);
		}
	}
	public void selecarro() {
		car=null;
		int i=rnd.nextInt(6);
		switch(i) {
		case 0:
			car="amarillo.png";
			break;
		case 1:
			car="naranja.png";
			break;
		case 2:
			car="rojo.png";
			break;
		case 3:
			car="azul.png";
			break;
		case 4:
			car="princicarro.png";
			break;
		case 5:
			car="hilocarro.png";
			break;
		}
		ImageIcon img=new ImageIcon(this.getClass().getResource(car));
		setImagen(img.getImage());	
	}
	
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	private void verfica() {
		switch(x) {
		case 584:
			elem[0]=false;
			y=-80;
		case 660:
			elem[1]=false;
			y=-80;
		case 745:
			elem[2]=false;
			y=-80;
		}
		
	}

	public Carrohilo() {
		ImageIcon img=new ImageIcon(this.getClass().getResource("azul.png"));
		imagen=img.getImage();
	}
	
	public String getNave() {
		return car ;
	}

	public void setNave(String nave) {
		this.car = nave;
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
		if(key==KeyEvent.VK_UP) {
			dy=10;
		}
	}
	public void keyReleased(KeyEvent e) {
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_UP) {
			dy=0;
		}
	}

	public void turbo(int boost) {
		this.boost=boost;
		
	}
	
}
