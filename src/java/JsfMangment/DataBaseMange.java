package JsfMangment;

import Control.PlayerController;
import Model.Player;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "control")
@RequestScoped
public class DataBaseMange {

    private Player player = new Player();
    private PlayerController pc = new PlayerController();
    private String error;
    public String addPlayer() {
        if(pc.addPlayer(player) == 1){
            return "Manger.xhtml";
        }
        error = "ID Is Exist";
        return null;
    }
    
    public void showPlayer() {
        player = pc.getPlayer(player);
        if(player == null){
            error = "ID Doesn't Exist";
        }
    }

    public String deletePlayer() {
        if(pc.deletePlayer(player) == 1){
         return "Manger.xhtml";
        }
        error = "ID Doesn't Exist";
        return null;
    }

    public String updatePlayer() {
        if(pc.updatePlayer(player) == 1){
         return "Manger.xhtml";
        }
        error = "ID Doesn't Exist";
        return null;
    }
    public List<Player> getAllPlayer() {
        return pc.getAllPlayer();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerController getPc() {
        return pc;
    }

    public void setPc(PlayerController pc) {
        this.pc = pc;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
}
