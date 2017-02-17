import java.util.Random;

/**
 * Created by dleal on 2/02/17.
 */
public class HiloEscritor implements Runnable {

    private Object e = new Object();
    private boolean aviso = false;
    private Metodos metodos;


    public HiloEscritor(Metodos metodos) {
        this.metodos = metodos;
    }

    @Override
    public void run() {

        metodos.Escribir();

    }


}
