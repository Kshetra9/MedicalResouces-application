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
public class PersonInfo {
    
    private String personName;
    private String personHouse;
    private String personCommunity;
    private String personCity;
    private int patientID;
    private String hospNear;
    private int personAge;

    public String getPersonHouse() {
        return personHouse;
    }

    public void setPersonHouse(String personHouse) {
        this.personHouse = personHouse;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getHospNear() {
        return hospNear;
    }

    public void setHospNear(String hospNear) {
        this.hospNear = hospNear;
    }
    
    

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonCity() {
        return personCity;
    }

    public void setPersonCity(String personCity) {
        this.personCity = personCity;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonCommunity() {
        return personCommunity;
    }

    public void setPersonCommunity(String personCommunity) {
        this.personCommunity = personCommunity;
    }
    
    @Override
    public String toString(){
        return personName;
    }
    
    
}
