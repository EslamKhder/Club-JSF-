package Control;

import DataBaseFiles.ServicesImplementation.ServicePlayer;
import Model.Player;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Eng Eslam khder
 */
public class PlayerController {
    private ServicePlayer serviceplayer;
    
    public PlayerController () {
        serviceplayer = new ServicePlayer();
    }
    public int addPlayer(Player player) {
        return serviceplayer.addPlayer(player);
    }
    public Player getPlayer(Player player) {
        return serviceplayer.getPlayer(player);
    }
    public int deletePlayer(Player player) {
        return serviceplayer.deletePlayer(player);
    }
    public int updatePlayer(Player player) {
        return serviceplayer.updatePlayer(player);
    }
    public List<Player> getAllPlayer() {
        return serviceplayer.getAllPlayer();
    }
}
