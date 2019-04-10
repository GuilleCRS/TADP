package U2.PingPong;

public class PingPong {
    public static void main (String []Args){
        Ping ObjPing = new Ping();
        Pong ObjPong = new Pong();
        Thread t1=new Thread(ObjPing);
        Thread t2=new Thread(ObjPong);
        t1.start();
        t2.start();
    }
}
