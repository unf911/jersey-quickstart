package jersey;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 03.06.13
 * Time: 0:04
 * To change this template use File | Settings | File Templates.
 */

@XmlRootElement
public class User {
    private final String user;
    private final String name;


    public User(String user, String name) {
        this.user = user;
        this.name = name;
    }
}
