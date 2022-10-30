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
public class PersonHistory {
    
    private ArrayList<PersonInfo> personhistory;
    
    public PersonHistory() {
    
        this.personhistory = new ArrayList<PersonInfo>();
}

    public ArrayList<PersonInfo> getPersonhistory() {
        return personhistory;
    }

    public void setPersonhistory(ArrayList<PersonInfo> personhistory) {
        this.personhistory = personhistory;
    }
    
    public PersonInfo addNewPerson() {
        PersonInfo addPerson = new PersonInfo();
        personhistory.add(addPerson);
        return addPerson;
    }
    
    public void deletePerson(PersonInfo pi){
        
        personhistory.remove(pi);
    }
    
}
