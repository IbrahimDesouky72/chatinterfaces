package com.talktoki.chatinterfaces.server;

import com.talktoki.chatinterfaces.client.ClientChatInt;
import com.talktoki.chatinterfaces.commans.Message;
import com.talktoki.chatinterfaces.commans.User;
import java.util.HashMap;

/**
 *
 * @author mahrous
 */
public interface ServerInterface {

    /* <------- Authentication methods -------> */
    /**
     * @param email
     * @param password
     * @return user data object from database if user exists or null if user
     * doesn't exist
     */
    public User signIn(String email, String password);

    /**
     * Add user into database
     *
     * @param user
     * @return (1) Successfully added code <br> (2) Email already exists code
     * </b> (3) Database exception
     */
    public int signUp(User user);

    /**
     *
     * @param myclient
     * @return true if successfully signed user out or false if an error occured
     */
    public boolean signOut(ClientChatInt myclient);

    /* <------- Message methods -------> */
    /**
     *
     * @param sender_email
     * @param receiver_email
     * @param message
     * @return true if successfully sent and false if error occured
     */
    public boolean sendToOne(String sender_email, String receiver_email, Message message);

    /**
     * Send message in a group chat
     * @param sender_email
     * @param message
     * @param group_id
     * @return true if successfully sent and false if not
     */
    public boolean sendToGroup(String sender_email, Message message, String group_id);

    /* <------- Other utilities methods -------> */
    /**
     *
     * @param email
     * @param status
     * @return (1) Online <br> (2) Away </b> (3) Busy
     */
    public boolean notifyStatus(String email, int status);

    /**
     * get contact list for any user
     *
     * @param email
     * @return hash map representing contact list as [email, status] pairs
     */
    public HashMap<String, Integer> getContactList(String email);

}
