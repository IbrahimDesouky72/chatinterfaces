package com.talktoki.chatinterfaces.server;

import com.talktoki.chatinterfaces.client.*;
import com.talktoki.chatinterfaces.commans.*;
import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author mahrous
 */
public interface ServerInterface extends Remote{

    /* <------- Authentication and connection methods -------> */
    /**
     * check user against databse
     *
     * @param email
     * @param password
     * @return user data object from database if user exists or null if user
     * doesn't exist
     * @throws java.rmi.RemoteException
     */
    public User signIn(String email, String password) throws RemoteException;

    /**
     * Adds the client to currently online served clients
     *
     * @param client
     * @return
     * @throws java.rmi.RemoteException
     */
    public void addClient(ClientInterface client) throws RemoteException;

    /**
     * Add user into database
     *
     * @param user
     * @return (1) Successfully added code <br> (2) Email already exists code
     * </b> (3) Database exception
     * @throws java.rmi.RemoteException
     */
    public int signUp(User user) throws RemoteException;

    /**
     * change user status in database to offline and remove client from served
     * clients by the server.
     *
     * @param myclient
     * @return true if successfully signed user out or false if an error occured
     * @throws java.rmi.RemoteException
     */
    public boolean signOut(ClientInterface myclient) throws RemoteException;

    /* <------- Message methods -------> */
    /**
     * Send a message to a specific user
     *
     * @param sender_email
     * @param receiver_email
     * @param message
     * @return true if successfully sent and false if error occured
     * @throws java.rmi.RemoteException
     */
    public boolean sendToOne(String sender_email, String receiver_email, Message message) throws RemoteException;

    /**
     * Creates a group so that the server knows to whom it should send the
     * sendToGroup message
     *
     * @param group_id group name concatenated with '$' then data create
     * @param group_members array of emails of group members
     * @return
     * @throws java.rmi.RemoteException
     */
    public int createGroup(String group_id, ArrayList<User> group_members) throws RemoteException;
    
    /**
     * gets array list of group ids
     * @param user_email 
     * @return 
     * @throws java.rmi.RemoteException 
     */
    public ArrayList<String> getUserGroupsIDs( String user_email ) throws RemoteException;
    
    /**
     * get users in that group
     * @param group_id group name concatenated with ',' then data create
     * @return 
     */
    public ArrayList<User> getGroupUsers( String group_id ) throws RemoteException;
    
    /**
     * Send message in a group chat
     *
     * @param sender_email
     * @param message
     * @param group_id
     * @return true if successfully sent and false if not
     * @throws java.rmi.RemoteException
     */
    public boolean sendToGroup(String sender_email, Message message, String group_id) throws RemoteException;

    /* <------- Other utilities methods -------> */
    /**
     * Notify the server that a user state has changed
     *
     * @param email
     * @param status
     * @throws java.rmi.RemoteException
     */
    public void notifyStatus(String email, int status) throws RemoteException;

    /**
     * get contact list for any user
     *
     * @param email
     * @return hash map representing contact list as [email, status] pairs
     * @throws java.rmi.RemoteException
     */
    public ArrayList<User> getContactList(String email) throws RemoteException;

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
     * @throws java.rmi.RemoteException
     */
    public int sendFriendshipRequest(String sender, String receiver) throws RemoteException;

    /**
     * the receiver replies with acceptance or refusal
     *
     * @param recevier the client who received friend request
     * @param sender the client who send friend request
     * @param accepted
     * @return true if notified the sender with the response and false to
     * indicated refusal
     * @throws java.rmi.RemoteException
     */
    public boolean friendshipRequestResponse(String recevier, String sender, boolean accepted) throws RemoteException;
    
    public int SendFile(String sender_Email,String reciever_Email,File FileName) throws RemoteException;

}
