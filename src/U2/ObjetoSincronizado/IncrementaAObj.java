package U2.ObjetoSincronizado;

import U2.Objeto;

public class IncrementaAObj extends Thread{
    Objeto obj=new Objeto();
    public void run(){
        obj.Incrementa(obj);
    }
    public String toString(){
        return obj.toString();
    }
}
