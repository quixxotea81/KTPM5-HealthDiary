package model;
public class OtherUser extends User {
    private final int limit = 1;
    public OtherUser(String id, String roles, String username, String password) {
        super(id, roles, username, password);
    }

}  
