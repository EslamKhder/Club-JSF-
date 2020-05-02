/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Embeddable;

/**
 *
 * @author Eng Eslam khder
 */
@Embeddable
public class Playersports {
    private String sport;

    public Playersports() {
    }

    public Playersports(String sport) {
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
    
}
