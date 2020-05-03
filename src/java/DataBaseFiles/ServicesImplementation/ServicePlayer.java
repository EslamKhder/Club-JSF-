package DataBaseFiles.ServicesImplementation;

import Control.DataBaseController;
import DataBaseFiles.ServicesInterface.ServicesPlayer;
import Model.Player;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class ServicePlayer implements ServicesPlayer {

    private SessionFactory sessionf = null;
    private DataBaseController dataBasecontroller;
    private Session session;

    public ServicePlayer() {
        dataBasecontroller = new DataBaseController();
        sessionf = dataBasecontroller.Connection();
        session = null;
    }

    @Override
    public int addPlayer(Player player) {
        try {
            session = dataBasecontroller.getSession(sessionf);
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
        session = dataBasecontroller.getSession(sessionf);
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
            session = dataBasecontroller.getSession(sessionf);
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
        session = dataBasecontroller.getSession(sessionf);
        session.beginTransaction();
        session.update(player);
        session.getTransaction().commit();
        return 1;
    }

    @Override
    public List<Player> getAllPlayer() {
        session = dataBasecontroller.getSession(sessionf);
        List<Player> players = new LinkedList<>();
        Criteria cri = session.createCriteria(Player.class
        );
        players = cri.list();
        return players;
    }

}
