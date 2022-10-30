/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kshetrahegde
 */
public class CommunityInfo {
    
    private String personName;
    private String personAddress;
    private String commName;
    private String commCity;
    private String hospNearby;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getHospNearby() {
        return hospNearby;
    }

    public void setHospNearby(String hospNearby) {
        this.hospNearby = hospNearby;
    }

    public String getCommName() {
        return commName;
    }

    public void setCommName(String commName) {
        this.commName = commName;
    }

    public String getCommCity() {
        return commCity;
    }

    public void setCommCity(String commCity) {
        this.commCity = commCity;
    }
    
    @Override
    public String toString(){
        return personName;
    }
    
}
