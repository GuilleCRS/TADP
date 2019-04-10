package U2;

public class Hilos1 {
    public static void main (String []Args){
        //Tarea1 t1=new Tarea1();
        //Tarea2 t2=new Tarea2();
        //Tarea3 t3=new Tarea3();
        IncrementaA IA= new IncrementaA();
        Thread h1=new Thread(IA);
        Thread h2=new Thread(IA);
        Thread h3=new Thread(IA);
        h1.start();
        h2.start();
        h3.start();

        //checa si uno o mas hilos estan activos
        while(h1.isAlive()||h2.isAlive()||h3.isAlive());
        System.out.println("A= "+IA);
    }
}
