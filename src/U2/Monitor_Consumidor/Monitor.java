package U2.Monitor_Consumidor;

public class Monitor {
    private int contenido;
    private boolean available= false;
    public synchronized int get() {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
            available = false;
            notify();
            return contenido;
        }
        public synchronized  void put(int value){
            while(available==true){
                try {
                    wait();
                }catch(InterruptedException e){

                }
            }
            contenido = value;
            available= true;
            notify();
    }
}
