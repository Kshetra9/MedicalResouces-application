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
public class CommunityHistory {
    
    private ArrayList<CommunityInfo> commhistory;
    
    public CommunityHistory() {
    
        this.commhistory = new ArrayList<CommunityInfo>();
}

    public ArrayList<CommunityInfo> getCommhistory() {
        return commhistory;
    }

    public void setCommhistory(ArrayList<CommunityInfo> commhistory) {
        this.commhistory = commhistory;
    }
    
    public CommunityInfo addNewCommunity() {
        CommunityInfo addCommunity = new CommunityInfo();
        commhistory.add(addCommunity);
        return addCommunity;
    }
    
    public void deleteCommunity(CommunityInfo ci){
        
        commhistory.remove(ci);
    }
    
}
