package U2;

public class Objeto {
    private static int A=0;
    public void Incrementa(Objeto obj){
        synchronized (obj){
            int Tra=A;
            StringBuilder r= new StringBuilder();
            for(int i=0;i<500;i++){
                r.append(".");
            }
            Tra++;
            A=Tra;

            System.out.println("**A="+A);
        }
    }
    public String toString(){
        return A+"";
    }
}
