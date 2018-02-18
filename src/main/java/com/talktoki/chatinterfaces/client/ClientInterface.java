package com.talktoki.chatinterfaces.client;

import com.talktoki.chatinterfaces.commans.Message;
import com.talktoki.chatinterfaces.commans.User;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author mahrous
 */
public interface ClientInterface extends Remote{

    /**
     * Receive a message from a specific friend
     *
     * @param sender_email
     * @param message
     * @return true to acknowledge to the server that client received the
     * message or false otherwise
     * @throws java.rmi.RemoteException
     */
    public boolean receiveFromOne(String sender_email, Message message) throws RemoteException; 
    /**
     * Receive a message in a specific group chat
     *
     * @param group_id
     * @param sender_email
     * @param message
     * @return
     * @throws java.rmi.RemoteException
     */
    public boolean receiveInGroup(String group_id, String sender_email, Message message) throws RemoteException;

    /**
     * The server calls this message if it's stopped or crashed to let client
     * exit
     * @throws java.rmi.RemoteException
     */
    public void terminate() throws RemoteException;

    /**
     * Gets user model
     *
     * @return user model
     * @throws java.rmi.RemoteException
     */
    public User getUser() throws RemoteException;

    /**
     * receives friendship request notification
     * @param sender_name to show name of the sender ( first and last names )
     * @param sender_email to uniquely identify user
     * @throws java.rmi.RemoteException
     */
    public void receiveFriendshipRequest(String sender_name, String sender_email) throws RemoteException;

    /**
     * Notify a client that one of his/her friends changed their status
     * @param friend
     * @param status (0) offline <br> (1) Online <br> (2) Away </b> (3) Busy
     * @throws java.rmi.RemoteException
     */
    public void notifyFriendStatusChanged(User friend, int status) throws RemoteException;
    /**********Mahrous*********/
    /**
     * the server uses this function to send announcements to clients
     * @param announcement simple text as announcement to clients
     */
    public void receiveServerAnnouncement(String announcement) throws RemoteException;
    
    /**
     * used by the server to give the user an updated contacts list 
     * @param friends
     * @throws RemoteException 
     */
    public void refreshContacts() throws RemoteException;
    /**********Mahrous*********/
    /************Bodour*////////////
    public boolean reciveFile(String SenderEmail, String filename, byte[] data, int dataLength,boolean firstSend) throws RemoteException; 
     
    
    /************Bodour*////////////
}
