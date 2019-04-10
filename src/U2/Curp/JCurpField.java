package U2.Curp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JCurpField extends JTextField implements KeyListener{
    private int Tamaño;
    public JCurpField(int n){
        super(n);
        Tamaño=n;
        mapeoTeclas();
        addKeyListener(this);

    }

    public void keyPressed(KeyEvent e){
        //if(e.isControlDown())
        //if(e.getKeyCode()==KeyEvent.VK_X || e.getKeyCode()==KeyEvent.VK_C || e.getKeyCode()==KeyEvent.VK_V){
        //e.consume();
        // }

    }
    public void keyReleased(KeyEvent e){

    }
    public void keyTyped(KeyEvent e){
        setText(getText().toUpperCase());
        char ch;
        ch = e.getKeyChar();
        if(getText().length()==Tamaño)
            e.consume();
        if(!Character.isDigit(ch)&&!Character.isAlphabetic(ch)){
            e.consume();
        }
        if(getText().length()<=3){
            if(Character.isDigit(ch)){
                e.consume();
            }
        }
        if(getText().length()>3 && getText().length()<10) {
           if (Character.isAlphabetic(ch)) {
               e.consume();
           }
        }
        if(getText().length()<10 && getText().length()>3){

            if(Character.isAlphabetic(ch)){
                e.consume();
            }

        }
        if(getText().length()==10){
            if(Character.isDigit(ch)){
                e.consume();
            }
            if(Character.isAlphabetic(ch)) {
                if (ch != 'M' && ch != 'H' && ch != 'm' && ch != 'h') {
                    e.consume();
                }
            }

        }
        if(getText().length()>10 && getText().length()<=15) {

            if(Character.isDigit(ch)){
                e.consume();
            }
        }
        if(getText().length()>15) {

            if(Character.isAlphabetic(ch)){
                e.consume();
            }
        }

    }

    public void mapeoTeclas(){
        ActionMap mapaAccion = getActionMap();
        InputMap map=getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        //F1
        KeyStroke key_F1= KeyStroke.getKeyStroke(KeyEvent.VK_F1,0);
        //Ctrl + o
        KeyStroke ctrl_O=KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK);
        //Ctrl + C , Ctrl + V
        KeyStroke ctrl_C=KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK,true);
        KeyStroke ctrl_V=KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK,true);
        //KeyActions
        map.put(key_F1,"Accion F1");
        mapaAccion.put("accion_F1",Accion_F1());

        map.put(ctrl_O,"accion_ctrl_o");
        mapaAccion.put("accion_ctrl_o",Accion_CTRLO());

        map.put(ctrl_C,"accion_ctrl_c");
        mapaAccion.put("accion_ctrl_c",Accion_CTRLC());

        map.put(ctrl_V,"accion_ctrl_v");
        mapaAccion.put("accion_ctrl_v",Accion_CTRLV());



    }
    private AbstractAction Accion_F1() {
        return new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imprimir("F1");
            }
        };
    }
    private AbstractAction Accion_CTRLO() {
        return new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imprimir("Ctrl+O");
            }
        };
    }
    private AbstractAction Accion_CTRLC() {
        return new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValidaCTRLC();
            }
        };
    }
    private AbstractAction Accion_CTRLV() {
        return new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValidaCTRLV();
            }
        };
    }
    public void imprimir(String cadena){
        System.out.println("Accion: "+ cadena);
        setText(cadena);
    }
    public void ValidaCTRLV(){
        for(int i=0;i<getText().length();i++){
            char T=getText().charAt(i);
            if(!Character.isDigit(T)){
                setText(getText().substring(0,i));
                Toolkit.getDefaultToolkit().beep();
                System.out.println("\007\007\007");
                return;
            }
        }
    }
    public void ValidaCTRLC(){}
  }


