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
public class HospitalDirectory {
    
    String hospName;
    String docName;
    String hospCity;
    String hospCommunity;
    String totalEmployees;
    String commPopulation;

    public String getHospName() {
        return hospName;
    }

    public void setHospName(String hospName) {
        this.hospName = hospName;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getHospCity() {
        return hospCity;
    }

    public void setHospCity(String hospCity) {
        this.hospCity = hospCity;
    }

    public String getHospCommunity() {
        return hospCommunity;
    }

    public void setHospCommunity(String hospCommunity) {
        this.hospCommunity = hospCommunity;
    }

    public String getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(String totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public String getCommPopulation() {
        return commPopulation;
    }

    public void setCommPopulation(String commPopulation) {
        this.commPopulation = commPopulation;
    }
    
    @Override
    public String toString(){
        return hospName;
    }
    
    
}
