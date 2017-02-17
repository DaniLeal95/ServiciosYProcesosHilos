/**
 * Created by dleal on 3/02/17.
 */
public class HiloLector implements Runnable {


    private Metodos metodos;

    public HiloLector(Metodos metodos) {
        this.metodos = metodos;
    }

    @Override
    public void run() {

        metodos.Leer();

    }

}
