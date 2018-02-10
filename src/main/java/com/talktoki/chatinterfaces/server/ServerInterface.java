package com.talktoki.chatinterfaces.server;

import com.talktoki.chatinterfaces.client.*;
import com.talktoki.chatinterfaces.commans.*;
import java.util.HashMap;

/**
 *
 * @author mahrous
 */
public interface ServerInterface {

    /* <------- Authentication and connection methods -------> */
    /**
     * check user against databse
     *
     * @param email
     * @param password
     * @return user data object from database if user exists or null if user
     * doesn't exist
     */
    public User signIn(String email, String password);

    /**
     * Adds the client to currently online served clients
     *
     * @param client
     * @return
     */
    public Boolean addClient(ClientInterface client);

    /**
     * Add user into database
     *
     * @param user
     * @return (1) Successfully added code <br> (2) Email already exists code
     * </b> (3) Database exception
     */
    public int signUp(User user);

    /**
     * change user status in database to offline and remove client from served
     * clients by the server.
     *
     * @param myclient
     * @return true if successfully signed user out or false if an error occured
     */
    public boolean signOut(ClientInterface myclient);

    /* <------- Message methods -------> */
    /**
     * Send a message to a specific user
     *
     * @param sender_email
     * @param receiver_email
     * @param message
     * @return true if successfully sent and false if error occured
     */
    public boolean sendToOne(String sender_email, String receiver_email, Message message);

    /**
     * Creates a group so that the server knows to whom it should send the
     * sendToGroup message
     *
     * @param group_id
     * @param group_members array of emails of group members
     * @return
     */
    public int createGroup(String group_id, String[] group_members);

    /**
     * Send message in a group chat
     *
     * @param sender_email
     * @param message
     * @param group_id
     * @return true if successfully sent and false if not
     */
    public boolean sendToGroup(String sender_email, Message message, String group_id);

    /* <------- Other utilities methods -------> */
    /**
     * Notify the server that a user state has changed
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

    /**
     * asks to add a client as friend this function checks if the receiver
     * already exists and then if exists then if he/she is offline send an
     * immediate request else the request is saved into database to check send
     * it later when user logs in
     *
     * @param sender
     * @param receiver
     * @return (0) User doesn't exist <br> (1) Successfully sent friend request
     * </b> (2) Database exception
     */
    public int sendFriendshipRequest(String sender, String receiver);

    /**
     * the receiver replies with acceptance or refusal
     *
     * @param recevier the client who received friend request
     * @param sender the client who send friend request
     * @param accepted
     * @return true if notified the sender with the response and false to
     * indicated refusal
     */
    public boolean friendshipRequestResponse(String recevier, String sender, boolean accepted);

}
