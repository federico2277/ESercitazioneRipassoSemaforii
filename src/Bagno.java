import static java.lang.Math.random;

public class Bagno extends Thread{

    String targhetta;
    Semaforo s;
    public Bagno(String t , Semaforo semaforo){
        t=targhetta;
        s=semaforo;
    }
    public synchronized void bagnoUsa(String nome){

        System.out.println(targhetta +":" + nome + "è entrato in bagno");
        try{
            
        Thread.sleep((long)(random()*1000));
        
        
        } catch (Exception e) {
      }
      System.out.println(targhetta +":" + nome + "è uscito in bagno");
    }

}

