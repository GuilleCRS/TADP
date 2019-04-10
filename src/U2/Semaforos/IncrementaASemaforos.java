package U2.Semaforos;

public class IncrementaASemaforos {
    public static void main(String []Args){
        Tarea1 H1=new Tarea1();
        Thread t1=new Thread(H1);
        Thread t2=new Thread(H1);
        Thread t3=new Thread(H1);
        t1.start();
        t2.start();
        t3.start();
        t1.setPriority(Thread.MIN_PRIORITY);t2.setPriority(1);t3.setPriority(1);
        while(t1.isAlive()||t2.isAlive()||t3.isAlive());
        System.out.println("A= "+H1);
    }
}
