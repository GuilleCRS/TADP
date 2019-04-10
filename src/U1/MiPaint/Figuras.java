package U1.MiPaint;

/**
 * Created by Guillermo Cruz on 13/09/2017.
 */
import java.awt.Color;

public class Figuras {
    private int Fig,x1,y1,x2,y2,ancho,alto;
    private boolean relleno;
    private Color color;

    public Figuras(int Fig, int x1, int y1, int x2, int y2, int ancho, int alto, Color color,boolean relleno) {
        this.Fig = Fig;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.ancho = ancho;
        this.alto = alto;
        this.relleno = relleno;
        this.color = color;
    }


    public int getFig() {
        return Fig;
    }

    public void setFig(int Fig) {
        this.Fig = Fig;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
