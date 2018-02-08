package com.talktoki.chatinterfaces.server;

import commans.Message;

/**
 *
 * @author mahrous
 */
public interface ServerChatInt {
    
    public boolean sendToOne(String sender_email, String receiver_email, Message message);
    
    // sends to a specific group
    public boolean sendToGroup(String sender_email, Message message, String group_id);
}
