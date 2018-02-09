package com.talktoki.chatinterfaces.client;

import com.talktoki.chatinterfaces.commans.Message;
import com.talktoki.chatinterfaces.commans.User;

/**
 *
 * @author mahrous
 */
public interface ClientInterface {

    /**
     * Receive a message from a specific friend
     *
     * @param sender_email
     * @param message
     * @return true to acknowledge to the server that client received the
     * message or false otherwise
     */
    public boolean receiveFromOne(String sender_email, Message message);

    /**
     * Receive a message in a specific group chat
     *
     * @param group_id
     * @param sender_email
     * @param message
     * @return
     */
    public boolean receiveInGroup(String group_id, String sender_email, Message message);

    /**
     * The server calls this message if it's stopped or crashed to let client
     * exit
     */
    public void terminate();

    /**
     * Gets user model
     *
     * @return user model
     */
    public User getUser();
}
