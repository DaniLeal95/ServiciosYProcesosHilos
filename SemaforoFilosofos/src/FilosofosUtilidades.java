import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * Created by dleal on 17/02/17.
 */
public class FilosofosUtilidades {
    private List<Semaphore> palillos = new ArrayList<>();
    public FilosofosUtilidades(int numerodefilosofos){


        for(int i = 0 ;i<numerodefilosofos;i++){
            palillos.add(new Semaphore(1));
        }

    }


}
