public class Persona extends Thread{
    
    String nome;
    Bagno bagno;
    
    public Persona (String n,Bagno b){
       this.nome = n;
        this.bagno= b;
    }

    public void run(){

        bagno.s.v();
        bagno.bagnoUsa(nome);
        bagno.s.p();

    }


}
