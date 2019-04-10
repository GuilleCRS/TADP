import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class TimerPrueba extends JFrame  {
	Timer n;
   public static void main(String []args) {
	   TimerPrueba n1=new TimerPrueba();
	   
   }
   public TimerPrueba(){
	   System.out.println("constructor");
	   this.setTitle("Hola");
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setVisible(true);
	   tim();
   }
   public void tim() {
	   System.out.println("tim");
	     n =new Timer(5000, e -> holi());
	    System.out.println("start");
	   n.start();
   }
   private void holi() {
	   System.out.println("Hola");
		
	}
}
