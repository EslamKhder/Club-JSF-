package Control;

import DataBaseFiles.ServicesImplementation.ServicePlayer;
import Model.Player;
import java.util.List;

/**
 *
 * @author Eng Eslam khder
 */
public class PlayerController {

    private ServicePlayer serviceplayer;

    public PlayerController() {
        serviceplayer = ServicePlayer.getInstance();
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
