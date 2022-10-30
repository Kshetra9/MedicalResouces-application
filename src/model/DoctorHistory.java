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
public class DoctorHistory {
    
    private ArrayList<DoctorInfo> history;
    
    public DoctorHistory() {
    
        this.history = new ArrayList<DoctorInfo>();
}

    public ArrayList<DoctorInfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<DoctorInfo> history) {
        this.history = history;
    }
    
    public DoctorInfo addNewDoctor() {
        DoctorInfo addDoctor = new DoctorInfo();
        history.add(addDoctor);
        return addDoctor;
    }
    
    public void deleteDoctor(DoctorInfo di){
        
        history.remove(di);
    }
    
}
