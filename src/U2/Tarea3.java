package U2;

public class Tarea3 /*extends Thread*/ implements Runnable {
    public void run(){
        int n=-1;
        System.out.println("*******Proceso 3 trabajando******");
        for(int i=0;i<2000000000;i++){
            n=n+1;

        }
        System.out.println("*******Proceso 3 terminado******");
    }
}
