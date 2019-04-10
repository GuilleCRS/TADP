package U2.Monitor_Consumidor;

public class Productor extends Thread{
    private Monitor monitor;
    private int number;
    public Productor(Monitor c){
        monitor=c;
    }
    public void run(){
        for(int i=0;i<20;i++){
            monitor.put(i);
            System.out.println("Productor,grabo: "+i);
            try{
                sleep((int)(Math.random()*100));
            }catch (InterruptedException e){}
        }
    }
}
