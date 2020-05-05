package DataBaseFiles.ServicesImplementation;

import DataBaseFiles.ServicesInterface.ServicesPlayer;
import Model.Player;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class ServicePlayer implements ServicesPlayer {
 private static ServicePlayer obj;
    private SessionFactory sessionf;
    private ServiceDatabase servicedatabase;
    private Session session;

    private ServicePlayer() {
        servicedatabase = new ServiceDatabase();
        sessionf = servicedatabase.DataBaseConnection();
        session = null;
    }
    public static ServicePlayer getInstance() 
    { 
        if (obj==null) 
            obj = new ServicePlayer(); 
        return obj; 
    }

    @Override
    public int addPlayer(Player player) {
        try {
            session = servicedatabase.getSession(sessionf);
            session.beginTransaction();
            session.save(player);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Player getPlayer(Player player) {
        session = servicedatabase.getSession(sessionf);
        try {
            Player play = (Player) session.get(Player.class, player.getId());
            return play;
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public int deletePlayer(Player player) {
        try {
            player = this.getPlayer(player);
            session = servicedatabase.getSession(sessionf);
            session.beginTransaction();
            session.delete(player);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            return 0;
        }

    }

    @Override
    public int updatePlayer(Player player) {
        session = servicedatabase.getSession(sessionf);
        session.beginTransaction();
        session.update(player);
        session.getTransaction().commit();
        return 1;
    }

    @Override
    public List<Player> getAllPlayer() {
        session = servicedatabase.getSession(sessionf);
        List<Player> players = new LinkedList<>();
        Criteria cri = session.createCriteria(Player.class
        );
        players = cri.list();
        return players;
    }

}
