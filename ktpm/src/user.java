public class User {
    private String ID;
    private String Roles;
    private String Username;
    private String Password;

    public String getID() {
        return ID;
    }
    
    public String getRoles() {
        return Roles;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void setRoles(String Roles) {
        this.Roles = Roles;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    public void setPassword(String Password) {
        this.Password = Password;
    }

    private boolean statusLogin = false;

    public void login (String Username, String Password){
        if (this.Username.equals(Username)&& this.Password.equals(Password)){
            statusLogin = true;
            System.out.println("Đăng nhập thành công");
        }
        else{
            System.out.println("Thông tin đăng nhập không chính xác!");
        }
    }
    public void logout(){
        if (statusLogin = true){
            statusLogin = false;
            System.out.println("Bạn đã đăng xuất");
        }
        else{
            System.out.println("Bạn chưa đăng nhập!");
        }
    }
    public void viewProfile(){
        if(statusLogin = true){
            System.out.println("THÔNG TIN CÁ NHÂN");
            System.out.println("ID: " +ID);
            System.out.println("Role: " +Roles);
            System.out.println("Name: " +Username);
        }
        else{
            System.out.println("Vui lòng đăng nhập!");
        }
    }
    public static void main(String[] args) {
        user user = new user();
        
        user.setID("001");
        user.setRoles("Admin");
        user.setUsername("user1");
        user.setPassword("pass123");

        System.out.println("---- Kiểm tra đăng nhập thành công ----");
        user.login("user1", "pass123");  
        user.viewProfile();

        System.out.println("---- Kiểm tra đăng nhập thất bại ----");
        user.login("user1", "wrongpass");  
        user.viewProfile();

        System.out.println("---- Kiểm tra đăng xuất ----");
        user.logout();
        user.viewProfile();
    }
}


