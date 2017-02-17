import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dleal on 26/01/17.
 */
@ApplicationPath("/")
public class Index extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( Verbos.class );
        return h;
    }

}
