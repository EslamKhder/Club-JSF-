/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Eng Eslam khder
 */

@Embeddable
public class Playerdays implements Serializable {
    private String day;

    public Playerdays() {
        
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    
}
