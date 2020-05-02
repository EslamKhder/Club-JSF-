
import Control.DataBaseController;
import Control.PlayerController;
import DataBaseFiles.ServicesInterface.ServicesPlayer;
import Model.Enums.Gender;
import Model.Enums.Sport;
import Model.Player;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eng Eslam khder
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            DataBaseController oc = new DataBaseController();
            oc.Connection();
        Player player = new Player();
        player.setId(1);
        player.setAge(21);
        player.setCountry("ALEX");
        player.setFname("Eso");
        player.setLname("elkh");
        player.setPhone("01111");
        player.setGender(Gender.Male);
        player.setSport(Sport.Tennis);
        PlayerController sp = new PlayerController();
        sp.updatePlayer(player);
//        player.setCountry("alex");
//        player.setFname("Eso");
//        player.setLname("elkh");
//        player.setPhone("01111");
//        player.setGender(Gender.Male);
//        player.getDays().add(new Playerdays("Sunday"));
//        player.getDays().add(new Playerdays("Monday"));
//        player.getDays().add(new Playerdays("Saturday"));
//        player.getSport().add(new Playersports("Football"));
//        player.getSport().add(new Playersports("Tennis"));
//        PlayerController oc = new PlayerController();
//        oc.addPlayer(player);
    }
    
}
