package com.talktoki.chatinterfaces.server;

public interface ServerAuthInt {
    
    public boolean signIn(String email, String password);
    
    // What should the return type be? ==> to handle each validation case at clientside
    // Any missing data?
    public boolean signUp(String first_name, String last_name, String gender,int age, String email, String password );
    
    public boolean signOut(String email, String password);
}
