package JsfMangment;

import Control.PlayerController;
import Model.Player;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "control")
@RequestScoped
public class DataBaseMange {

    private Player player = new Player();
    private PlayerController pc = new PlayerController();
//    private List<Playersports>  sports = new ArrayList();
//    private List<Playerdays> days = new ArrayList();
    
    public void addPlayer() {
        pc.addPlayer(player);
    }

    public void showPlayer() {
        player = pc.getPlayer(player);
    }

    public void deletePlayer() {
        pc.deletePlayer(player);
    }

    public void updatePlayer() {
        pc.updatePlayer(player);
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

//    public List<Playersports> getSports() {
//        return sports;
//    }
//
//    public void setSports(List<Playersports> sports) {
//        this.sports = sports;
//    }
//
//    public List<Playerdays> getDays() {
//        return days;
//    }
//
//    public void setDays(List<Playerdays> days) {
//        this.days = days;
//    }
//    
}
