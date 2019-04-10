package U2.ObjetoSincronizado;

public class IncrementaAObjSyn {
    public static void main(String []a){
        IncrementaAObj H1=new IncrementaAObj();
        Thread t1=new Thread(H1);
        Thread t2=new Thread(H1);
        Thread t3=new Thread(H1);
        t1.setPriority(10);t2.setPriority(10);t3.setPriority(10);
        t1.start();t2.start();t3.start();
        while(t1.isAlive()||t2.isAlive()||t3.isAlive());
        System.out.println("A= "+H1);
    }
}
