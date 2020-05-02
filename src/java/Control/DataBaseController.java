package Control;

import DataBaseFiles.ServicesImplementation.ServiceDatabase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class DataBaseController {
    private ServiceDatabase servicedatabase;
    public DataBaseController(){
        servicedatabase = new ServiceDatabase();
    }
    public SessionFactory Connection() {
        return servicedatabase.DataBaseConnection();
    }
    public Session getSession(SessionFactory sessionf) {
        return servicedatabase.getSession(sessionf);
    }
}
