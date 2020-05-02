package DataBaseFiles.ServicesInterface;

import Model.Player;
import java.util.List;

/**
 *
 * @author Eng Eslam khder
 */
public interface ServicesPlayer {
    public int addPlayer(Player player);
    public Player getPlayer(Player player);
    public int updatePlayer(Player player);
    public int deletePlayer(Player player);
    public List<Player> getAllPlayer();
}
