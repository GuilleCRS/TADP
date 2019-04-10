package U2.Sincronizado;

public class IncrementaASyn extends Thread{
    private static int A=0;
    public void run(){
        HazSuma();
    }
    public synchronized void HazSuma(){
        A++;
    }
    public String toString(){
        return A+"";
    }
}
