import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dleal on 26/01/17.
 */

@ApplicationPath("/")
public class Main extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( Metodos.class );
        return h;
    }

}
