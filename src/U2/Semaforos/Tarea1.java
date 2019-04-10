package U2.Semaforos;

public class Tarea1 extends Thread {
    private static double A=0;
    private static Semaforo S=new Semaforo(1);
    public void run(){
        S.Espera();
        //Sección Crítica
        double Tra=A;
        Tra++;
        A=Tra;
        S.Libera();
    }
    public String toString(){
        return A+"";
    }
}
