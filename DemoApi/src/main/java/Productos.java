import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by dleal on 26/01/17.
 */
@Path("/productos")
public class Productos {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getProductos(){
        return "Toma producto morena";
    }
}
