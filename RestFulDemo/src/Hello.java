import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

/**
 * Created by dleal on 27/01/17.
 */
@Path("/hello")
public class Hello {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello(){
        return "Que pasa nano";
    }

}
