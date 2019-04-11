package U1.MiPaint;

/*
  Created by AGuillermo Cruz on 13/09/2017.
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

    public class JPLienzo extends JPanel implements MouseListener,
            MouseMotionListener, KeyListener
    {
        private static final long serialVersionUID = 1L;
        private int figura, x1, y1, x2, y2, ancho, alto;
        private Color color;
        private boolean relleno=false;
        private ArrayList<Figuras> contenido;

        public JPLienzo()
        {
            super();
            setBackground(Color.white);
            contenido = new ArrayList<>();
            figura=0;
            x1=0;
            y1=0;
            x2=0;
            y2=0;
            color= Color.BLACK;
            relleno=false;
            addMouseListener(this);
            addMouseMotionListener(this);
            addKeyListener(this);
            repaint();

        }
        public void BorraLienzo()
        {
            contenido.clear();
            x1 = 0;
            x2 = 0;
            y1 = 0;
            y2 = 0;
            repaint();

        }


        public int getFigura() {
            return figura;
        }
        public void setFigura(int figura) {
            this.figura = figura;
        }
        public Color getColor() {
            return color;
        }
        public void setColor(Color color) {
            this.color = color;
        }
        public boolean isRelleno() {
            return relleno;
        }
        public void setRelleno(boolean relleno) {
            this.relleno = relleno;
        }
        public void paint(Graphics g)
        {
            super.paint(g);
            PintaTodo(g);

            ancho=Math.abs(x2-x1);
            alto=Math.abs(y2-y1);
            g.setColor(color);
            if(relleno)
            {
                switch(figura)
                {
                    case 0: //Linea
                        g.drawLine(x1,y1,x2,y2);
                        break;
                    case 1:
                        g.fillOval(x1<x2 ? x1: x2, y1<y2 ? y1: y2, ancho, alto);
                        break;
                    case 2:
                        g.fillRect(x1<x2 ? x1: x2, y1<y2 ? y1: y2, ancho, alto);
                        break;
                    case 3:
                        if(ancho<alto)
                        {
                            ancho = alto;
                        }
                        else
                        {
                            alto = ancho;
                        }
                        g.fillOval(x1<x2 ? x1: x2, y1<y2 ? y1: y2, ancho, alto);
                        break;
                    case 4: //Cuadrado
                        if(ancho<alto)
                        {
                            ancho = alto;
                        }
                        else
                        {
                            alto = ancho;
                        }
                        g.fillRect(x1<x2 ? x1: x2,y1<y2 ? y1: y2, ancho, alto);
                        break;
                }
            }
            else
            {
                switch(figura)
                {
                    case 0:
                        g.drawLine(x1, y1, x2, y2);
                        break;
                    case 1:
                        g.drawOval(x1<x2 ? x1: x2, y1<y2 ? y1: y2, ancho, alto);
                        break;
                    case 2:
                        g.drawRect(x1<x2 ? x1: x2, y1<y2 ? y1: y2, ancho, alto);
                        break;
                    case 3:
                        if(ancho<alto)
                        {
                            ancho = alto;
                        }
                        else
                        {
                            alto = ancho;
                        }
                        g.drawOval(x1<x2 ? x1: x2, y1<y2 ? y1: y2, ancho, ancho);
                        break;
                    case 4: //Cuadrado
                        if(ancho<alto)
                        {
                            ancho = alto;
                        }
                        else
                        {
                            alto = ancho;
                        }

                        g.drawRect(x1<x2 ? x1: x2, y1<y2 ? y1: y2, ancho, alto);
                        break;

                }
            }
        }

        private void PintaTodo(Graphics g)
        {
            Figuras F;
            for (Figuras figuras : contenido) {
                F = figuras;
                g.setColor(F.getColor());
                if (!F.isRelleno()) {
                    switch (F.getFig()) {
                        case 0: //Linea
                            g.drawLine(F.getX1(), F.getY1(), F.getX2(), F.getY2());
                            break;
                        case 1: //Ovalo
                            g.drawOval(F.getX1() < F.getX2() ? F.getX1() : F.getX2(), F.getY1() < F.getY2() ? F.getY1() : F.getY2(), F.getAncho(), F.getAlto());
                            break;
                        case 2: //Rectangulo
                            g.drawRect(F.getX1() < F.getX2() ? F.getX1() : F.getX2(), F.getY1() < F.getY2() ? F.getY1() : F.getY2(), F.getAncho(), F.getAlto());
                            break;
                        case 3: //Circulo
                            if (ancho < alto) {
                                ancho = alto;
                            } else {
                                alto = ancho;
                            }
                            g.drawOval(F.getX1() < F.getX2() ? F.getX1() : F.getX2(), F.getY1() < F.getY2() ? F.getY1() : F.getY2(), F.getAncho(), F.getAlto());
                            break;
                        case 4: //Cuadrado
                            if (ancho < alto) {
                                ancho = alto;
                            } else {
                                alto = ancho;
                            }
                            g.drawRect(F.getX1() < F.getX2() ? F.getX1() : F.getX2(), F.getY1() < F.getY2() ? F.getY1() : F.getY2(), F.getAncho(), F.getAlto());
                            break;
                    }
                } else {
                    switch (F.getFig()) {
                        case 0: //Linea
                            Graphics2D g2 = (Graphics2D) g;
                            g2.setStroke(new BasicStroke(10,1,2));
                            g2.drawLine(F.getX1(), F.getY1(), F.getX2(), F.getY2());
                            break;
                        case 1: //Ovalo
                            g.fillOval(F.getX1() < F.getX2() ? F.getX1() : F.getX2(), F.getY1() < F.getY2() ? F.getY1() : F.getY2(), F.getAncho(), F.getAlto());
                            break;
                        case 2: //Rectangulo
                            g.fillRect(F.getX1() < F.getX2() ? F.getX1() : F.getX2(), F.getY1() < F.getY2() ? F.getY1() : F.getY2(), F.getAncho(), F.getAlto());
                            break;
                        case 3: //Circulo
                            if (ancho < alto) {
                                ancho = alto;
                            } else {
                                alto = ancho;
                            }
                            g.fillOval(F.getX1() < F.getX2() ? F.getX1() : F.getX2(), F.getY1() < F.getY2() ? F.getY1() : F.getY2(), F.getAncho(), F.getAlto());
                            break;
                        case 4: //Cuadrado
                            if (ancho < alto) {
                                ancho = alto;
                            } else {
                                alto = ancho;
                            }
                            g.fillRect(F.getX1() < F.getX2() ? F.getX1() : F.getX2(), F.getY1() < F.getY2() ? F.getY1() : F.getY2(), F.getAncho(), F.getAlto());
                            break;
                    }
                }
            }

        }



        @Override
        public void keyPressed(KeyEvent arg0)
        {


        }

        @Override
        public void keyReleased(KeyEvent arg0)
        {


        }

        @Override
        public void keyTyped(KeyEvent arg0)
        {


        }

        @Override
        public void mouseDragged(MouseEvent e)
        {
            x2=e.getX();
            y2=e.getY();
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseClicked(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseEntered(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseExited(MouseEvent arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mousePressed(MouseEvent e)
        {
            x1=e.getX();
            y1=e.getY();



        }

        @Override
        public void mouseReleased(MouseEvent arg0)
        {
            contenido.add(new Figuras(figura, x1, y1, x2, y2, ancho, alto, color, relleno));

        }
        public ArrayList<Figuras> getContenido(){
            return contenido;
        }
        public void setContenido(ArrayList<Figuras> contenido){
            this.contenido=contenido;
            repaint();
        }
        public void copiar(Graphics g){
            if(ancho<alto)
            {
                ancho = alto;
            }
            else
            {
                alto = ancho;
            }
            g.copyArea(x1,y1,ancho,alto,x2,y2);

        }

    }

