/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kshetrahegde
 */
public class HospitalHistory {
    
    private ArrayList<HospitalDirectory> hospitalhistory;

    public ArrayList<HospitalDirectory> getHospitalhistory() {
        return hospitalhistory;
    }

    public void setHospitalhistory(ArrayList<HospitalDirectory> hospitalhistory) {
        this.hospitalhistory = hospitalhistory;
    }
    
    public HospitalDirectory addNewHospital() {
        HospitalDirectory addHospital = new HospitalDirectory();
        hospitalhistory.add(addHospital);
        return addHospital;
    }
    
    public void deleteHospital(HospitalDirectory hi){
        
        hospitalhistory.remove(hi);
    }
}
