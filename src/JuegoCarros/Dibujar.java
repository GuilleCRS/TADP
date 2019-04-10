package JuegoCarros;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Dibujar extends JPanel implements ActionListener{
	private Carro1 carro1;
	private Carrohilo carro2,carro3;
	private Timer timer2;
	private boolean choque,choque2;
	int contador=0;
	Timer tiempo;
	Font nuevaFuente = new Font ("Cambria", Font.BOLD, 25);
	Font GO = new Font ("Cambria", Font.BOLD, 70);
	private static final long serialVersionUID = 1L;
	ImageIcon img=new ImageIcon(this.getClass().getResource("playam.gif"));
	Image gif=img.getImage();
	ImageIcon explosion=new ImageIcon(this.getClass().getResource("explosion.png"));
	Image explo=explosion.getImage();
	ImageIcon carroprin=new ImageIcon(this.getClass().getResource("blanco.png"));
	Image carro=carroprin.getImage();
	ImageIcon gameo=new ImageIcon(this.getClass().getResource("wasted.png"));
	Image gameover=gameo.getImage();
	AudioClip clip = Applet.newAudioClip(this.getClass().getResource("audio.wav"));
	AudioClip bomb = Applet.newAudioClip(this.getClass().getResource("bomb.wav"));
	AudioClip cambio = Applet.newAudioClip(this.getClass().getResource("gears.wav"));
	AudioClip wasted = Applet.newAudioClip(this.getClass().getResource("wasteds.wav"));
	int vidas=2;
		

	public Dibujar() {
		setBackground(Color.BLACK);
		choque=false;
		setFocusable(true);
		addKeyListener(new teclado());
		carros();
		Timer timer = new Timer(1, this);
		timer.start();
		tiempo.start();
		var a="hola";
		a=a+true;
		System.out.println(a);
	}
	public void carros() {
		carro1=new Carro1();
		carro1.start();
		carro2=new Carrohilo();
		carro3=new Carrohilo();
	    Carrohilo car[]= {carro2,carro3};
        tiempo=new Timer(1000, e -> {
			car[contador].start();
			contador++;
			if(contador==2) {

				tiempo.stop();
			}
			if(contador==1) {
				cambio.loop();
				clip.loop();
			}
		});
     
    }
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D) g;
		g2.drawImage(gif,420,0,null);
		g2.drawImage(carro1.getImagen(), carro1.getX(), carro1.getY(),null);
		g2.drawImage(carro2.getImagen(), carro2.getX(), carro2.getY(),null);
		g2.drawImage(carro3.getImagen(), carro3.getX(), carro3.getY(), null);
		g.setFont(nuevaFuente);
		g.setColor(Color.red);
		g2.drawString("Puntos: ", 135, 200);
		g2.setColor(Color.WHITE);
		g2.drawString(Integer.toString(carro2.getPuntos()), 250, 200);
		g.setColor(Color.red);
		g2.drawString("Vidas: ", 135, 250);
		g2.setColor(Color.WHITE);
		g2.drawString(Integer.toString(vidas+1), 246, 250);
		if(choque) {
			gameover(g2);
		}
		if(choque2) {
			gameover(g2);
		}
		
	}
	private void gameover(Graphics2D g) {
		 g.setFont(GO);
		 g.setColor(Color.black);
		 g.setColor(new Color(0,0,0,0.7f));
		 g.fillRect(0,0, 2000,2000);
		 g.drawImage(gameover, 550, 50,null);
		 g.setColor(Color.red);
		 g.drawString("Puntuacion: ", 40, 700);
		 g.drawString(Integer.toString(carro2.getPuntos()),530,700);
		 
		
	
		
	}
	private void opt() {
		repaint();
		clip.stop();
		int opcion = JOptionPane.showConfirmDialog(null, "Quieres continuar jugando?",  "Tienes "+(vidas)+" Disponibles", JOptionPane.YES_NO_OPTION); 
       if (opcion == JOptionPane.NO_OPTION) {
          System.exit(0);
        }
       if (vidas==0) {
    	   System.exit(0);
       }
       if (opcion== JOptionPane.YES_OPTION) {
    	   vidas=vidas-1;
       }
		carro1.setImagen(carro);
		carro2.setY(-500);
    	carro3.setY(-600);
    	carro2.setPuntos(0);
    	clip.loop();
    	cambio.loop();
    	Carrohilo.setBoost(0);
    	Carrohilo.setNoboost(0);
    	return;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		choque=colision(carro1.getX(),carro1.getY(),carro1.getX()+45,carro1.getY()+91,
				carro2.getX(),carro2.getY(),carro2.getX()+45,carro2.getY()+91);
		choque2=colision(carro1.getX(),carro1.getY(),carro1.getX()+45,carro1.getY()+91,
				carro3.getX(),carro3.getY(),carro3.getX()+45,carro3.getY()+91);
		carro1.mover();
		repaint();
	}
	private boolean colision(int x1, int y1, int anchoA, int altoA, int x2, int y2, int anchoB, int altoB) {
		boolean band = false;
		band = isColision(x1, y1, anchoA, x2, y2, anchoB, altoB, band);
		band = isColision(anchoA, altoA, x1, x2, y2, anchoB, altoB, band);
		if( band) {
	   
	    	cambio.stop();
	    	//bomb.play();
	    	choque=true;
	    	carro2.setY(-500);
	    	carro3.setY(-600);
	    	carro1.setImagen(explo);
	    	repaint();
	    	wasted.play();
	    	opt();
	    	
	    }
	    return band;
	    
	}

	private boolean isColision(int x1, int y1, int anchoA, int x2, int y2, int anchoB, int altoB, boolean band) {
		if((x1)>=(x2) && (y1)>=(y2)&&(x1)<=(anchoB) &&(y1)<=(altoB)){
			   carro1.setImagen(explo);
			   repaint();
					band= true;
				}
		if((anchoA>=x2) && (y1>=y2)&&(anchoA<=anchoB)&& (y1<=altoB)){
			   carro1.setImagen(explo);
			   repaint();
					band=true;
				}
		return band;
	}

	private class teclado extends KeyAdapter {
	public void keyReleased(KeyEvent e) {
			carro1.keyReleased(e);
		}
	public void keyPressed(KeyEvent e) {
			carro1.keyPressed(e);



	}
	
	}
}

	

