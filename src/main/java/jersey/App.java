package jersey;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        System.out.println( "Hello World!" );
        Server server = new Server(8080);

        String webappDirLocation = "src/main/webapp/";
        WebAppContext root = new WebAppContext();
        root.setContextPath("/");
        root.setDescriptor(webappDirLocation + "/WEB-INF/web.xml");
        root.setResourceBase(webappDirLocation);
        root.setParentLoaderPriority(true);
        server.setHandler(root);

        server.start();
        server.join();
    }
}
