package U2.Monitor_Consumidor;

public class Consumidor extends Thread {
    private Monitor monitor;
    private int number;
    public Consumidor(Monitor c){
        monitor=c;
    }
    public void run(){
        int value=0;
        for(int i=0;i<20;i++){
            value=monitor.get();
            System.out.println("Cliente , Leyo: "+value);
        }
    }
}
