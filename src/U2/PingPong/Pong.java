package U2.PingPong;

public class Pong extends Thread{
    public void run(){
        while(true){
            System.out.print("Pong");
            /*try {
                sleep(50);
            }catch(InterruptedException e){
                return;
            }*/
            yield();
        }
    }
}
