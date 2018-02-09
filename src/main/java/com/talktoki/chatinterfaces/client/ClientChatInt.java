
package com.talktoki.chatinterfaces.client;

import com.talktoki.chatinterfaces.commans.Message;
import com.talktoki.chatinterfaces.commans.User;

/**
 *
 * @author mahrous
 */
public interface ClientChatInt {

    // here the client receives a message from one of friends
    public boolean receiveFromOne(String sender_email, Message message);
    
    // for group chatting
//  public boolean receiveInGroup(List of users, String sender_email, Message message);
    public boolean receiveInGroup(String group_id, String sender_email, Message message);
    
    public User getUser();
}
