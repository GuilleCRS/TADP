package U2.PingPong;

public class Ping extends Thread {
    public void run(){
        while(true) {
            System.out.print("ping");
            /*try {
                sleep(10);
            } catch (InterruptedException e) {
                return;
            }*/
            yield();
        }
    }
}
