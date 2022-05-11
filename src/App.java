public class App {
    public static void main(String[] args) throws Exception {
        
        Semaforo semaforoBagnouomini = new Semaforo(0);
        Semaforo semaforoBagnoFemmine = new Semaforo(0);

        Bagno bagnoUomini = new Bagno("M", semaforoBagnouomini);
        Bagno bagnoFemmine = new Bagno("F",semaforoBagnoFemmine);

        Persona p1 = new Persona("lollo", bagnoUomini);
        Persona p2 = new Persona("roberto", bagnoUomini);
        Persona p3 = new Persona("aldo", bagnoUomini);
        Persona p4 = new Persona("giorgia", bagnoUomini);
        Persona p5 = new Persona("michela", bagnoUomini);
        Persona p6 = new Persona("virginia", bagnoUomini);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();

        
    }
}
