package U2.Monitor_Consumidor;

public class ProductorConsumidor {
    public static void main(String []Args){
        Monitor c=new Monitor();
        Productor p1=new Productor(c);
        Consumidor c1=new Consumidor(c);
        p1.start();
        c1.start();
    }
}
