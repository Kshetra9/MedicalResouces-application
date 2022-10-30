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
public class EncounterHistory {
    
    private ArrayList<PatientInfo> history;
    
    public EncounterHistory() {
    
        this.history = new ArrayList<PatientInfo>();
}

    public ArrayList<PatientInfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<PatientInfo> history) {
        this.history = history;
    }
    
    public PatientInfo addNewPatient() {
        PatientInfo addPatient = new PatientInfo();
        history.add(addPatient);
        return addPatient;
    }
    
    public void deletePatient(PatientInfo pi){
        
        history.remove(pi);
    }
    
    
}
