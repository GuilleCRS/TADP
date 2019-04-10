package U2;

public class Tarea1 /*extends Thread */ implements Runnable{
    public void run(){
        System.out.println(" ********* Proceso 1 Trabajando ********");
        for(int i=0;i<500000000;i++){

        }
        System.out.println(" ********* Proceso 1 Terminado ********");
    }
}
