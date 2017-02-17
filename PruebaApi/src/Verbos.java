import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by dleal on 26/01/17.
 */
@Path("/Productos")
public class Verbos {

    @GET
    @Produces("text/plain")
    public String getProductos(){
        return "Productos";
    }
}
