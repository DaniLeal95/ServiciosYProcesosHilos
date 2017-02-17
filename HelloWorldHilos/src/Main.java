/**
 * Created by dleal on 2/02/17.
 */
public class Main {

    public static void main (String args[]){

        Metodos m = new Metodos();

        HiloEscritor hiloEscritor= new HiloEscritor(m);
        HiloLector hiloLector = new HiloLector(m);

        Thread hilo1 = new Thread(hiloEscritor);
        Thread hilo2 = new Thread(hiloLector);

        hilo2.start();
        hilo1.start();

    }
}
