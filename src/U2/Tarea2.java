package U2;

public class Tarea2 /*extends Thread*/ implements Runnable {
    public void run(){
        System.out.println("******Proceso 2 Trabajando********");
        for(int i=0;i<200000000;i++){

        }
        System.out.println("******Proceso 2 Terminado********");
    }
}
