package com.talktoki.chatinterfaces.server;

import java.util.HashMap;

/**
 *
 * @author mahrous
 */
public interface ServerUtilInt {
    
    /* User says wether he/she is onilne or offline
     true: online, false: offline
     Server is supposed to take this piece of information and pass it to all clients */    
    public boolean notifyStatus( String email, boolean status );
    
    /*
        User uses this method to get his/her contact list with updated status at any moment
        use case 1 : at start of client application
        use case 2 : when contact list is updated
    
        HashMap is returned with pairs of [ email ] => [ status ] 
    */
//    public HashMap<User,Boolean> getContactList( String email );
    public HashMap<String,Boolean> getContactList( String email );
    
    
    // TODO
    public void sendFile();
    
}
