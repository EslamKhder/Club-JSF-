package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

/**
 *
 * @author Eng Eslam khder
 */

@Entity
@Table(name = "Player")
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "First_Name", nullable = false)
    private String fname;
    @Column(name = "Last_Name", nullable = false)
    private String lname;
    @Column(name = "Age", nullable = false)
    private int age;
    @Column(name = "Phone_Number", nullable = false)
    private String phone;
    @Enumerated(EnumType.STRING)
    @Column(name = "Gender", nullable = false)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    @Column(name = "Sport", nullable = false)
    private Sport sport;
    @Column(name = "Country", nullable = false)
    private String country;
    
//    @ElementCollection
//    @JoinTable(name = "PlayerSports",joinColumns = @JoinColumn(name = "Player1"))
//    private List<Playersports>  sports = new ArrayList();
//    @ElementCollection
//    @JoinTable(name = "PlayerDays",joinColumns = @JoinColumn(name = "Player2"))
//    private List<Playerdays> days = new ArrayList();
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "Players_Relationship",joinColumns = {@JoinColumn(name = "player_ID")},inverseJoinColumns = {@JoinColumn(name = "player_Item_ID")})
//    private List<PlayerItems> playeritems = new ArrayList<PlayerItems>();

    public Player() {
        
    }

    public Player(int id, String fname, String lname, int age, String phone, Gender gender, String country) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
    
}