package DataBaseFiles.ServicesImplementation;

import DataBaseFiles.ServicesInterface.ServicesDatabase;
import HibernateFiles.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class ServiceDatabase implements ServicesDatabase {
    
    @Override
    public SessionFactory DataBaseConnection() {
        return HibernateUtil.getSessionFactory();
        
    }
    
    @Override
    public Session getSession(SessionFactory sessionf) {
        return sessionf.openSession();
    }
}