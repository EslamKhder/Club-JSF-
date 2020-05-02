package DataBaseFiles.ServicesInterface;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public interface ServicesDatabase {
    public SessionFactory DataBaseConnection();
    public Session getSession(SessionFactory sessionf);
}
