package NaveAnima;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Dibujar extends JPanel implements ActionListener{

	private Nave nave;
    private boolean choque;
	
	private static final long serialVersionUID = 1L;

	public Dibujar() {
		setBackground(Color.BLUE);
		choque=false;
		setFocusable(true);
		addKeyListener(new teclado());
        JLabel fondo = new JLabel(new ImageIcon(this.getClass().getResource("cielo fuente.jpg")));
		add(fondo);
		nave=new Nave();
        Timer timer = new Timer(15, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D) g;
		g2.drawImage(nave.getImagen(), nave.getX(), nave.getY(),null);
		//if (choque) {
			//g2.setColor(Color.BLUE);
			//g2.
			//g2.fillRect(300, 300, 300, 300);
		//}//
		//else {
			//g2.setColor(Color.BLACK);
			//g2.drawRect(300, 300, 300, 300);
		//}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		choque=colision(nave.getX(),nave.getY(),263,62,300,300,300,300);
		nave.mover();
		repaint();
	}
	
	private boolean colision(int x1, int y1, int anchoA, int altoA, int x2, int y2, int anchoR, int altoR) {
		final boolean b = (y1 > y2 && y1 < y2 + altoR) || (y1 + altoA > y2 && y1 + altoA < y2 + altoR);
		if (x1>x2 && x1<x2+anchoR && b)
			nave.setX(nave.getX()+1);
		if (x1+anchoA>x2 && x1+anchoA<x2+anchoR && b)
			nave.setX(nave.getX()-1);
		if (y1>y2 && y1<y2+altoR && ((x1 > x2 && x1 < x2 + anchoR) || (x1 + anchoA > x2 && x1 + anchoA < x2 + anchoR)))
			nave.setY(nave.getY()+1);
		if (y1+altoA>y2 && y1+altoA<y2+altoR && ((x1 > x2 && x1 < x2 + anchoR) || (x1 + anchoA > x2 && x1 + anchoA < x2 + anchoR)))
			nave.setY(nave.getY()-1);
		return (x1>x2 && x1<x2+anchoR && y1>y2 && y1<y2+altoR) ||
			(x1+anchoA>x2 && x1+anchoA<x2+anchoR && y1>y2 && y1<y2+altoR) ||
			(x1>x2 && x1<x2+anchoR && y1+altoA>y2 && y1+altoA<y2+altoR) ||
			(x1+anchoA>x2 && x1+anchoA<x2+anchoR && y1+altoA>y2 && y1+altoA<y2+altoR);
	}

	private class teclado extends KeyAdapter {
		public void keyReleased(KeyEvent e) {
			nave.keyReleased(e);
		}
		
		public void keyPressed(KeyEvent e) {
			nave.keyPressed(e);
		}
	}
}
