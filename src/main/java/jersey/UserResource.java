package jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 02.06.13
 * Time: 21:57
 * To change this template use File | Settings | File Templates.
 */
@Path("/users2")
public class UserResource {
//    @GET
//    @Produces("text/plain")
//    public String getUser() {
//         return "user";
//    }

    @GET
    @Produces("application/json")
//    @Path("class")
    public User getUser2(){
        return new User("user", "name");
    }
}
