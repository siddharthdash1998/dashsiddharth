/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author mac
 */
public class User {

    public User() {
    }

    User(Person person) {
        
        this.setUser_NUID(person.getNUID());
        this.setUser_UserId(person.getUserId());
        this.setUser_Username(person.getUsername());
        this.setUser_Password(person.getPassword());
        this.Enabled_check=false;
        String username=person.getUsername();
        String password=person.getPassword();
        passwordHashing.registerUser(username,password);
        
        
    }

  
   
    
    
    
    public String getUser_UserId() {
        return User_UserId;
    }

    public void setUser_UserId(String User_UserId) {
        this.User_UserId = User_UserId;
    }

    public String getUser_NUID() {
        return User_NUID;
    }

    public void setUser_NUID(String User_NUID) {
        this.User_NUID = User_NUID;
    }

    public String getUser_Username() {
        return User_Username;
    }

    public void setUser_Username(String User_Username) {
        this.User_Username = User_Username;
    }

    public String getUser_Password() {
        return User_Password;
    }

    public void setUser_Password(String User_Password) {
        this.User_Password = User_Password;
    }
    
    private String User_UserId;
    private String User_NUID;
    private String User_Username;
    private String User_Password;

    public Boolean getEnabled_check() {
        return Enabled_check;
    }

    public void setEnabled_check(Boolean Enabled_check) {
        this.Enabled_check = Enabled_check;
    }
    private Boolean Enabled_check;
    
    //if I add a person, it should add a user as well, I want user addition to strictly be linked to person 
    
    /*
    public void addUser(Person person, userDirectory userList){
        
        User user = new User(person);
        userList.addUserList(user);
        
        
        
        
        //remember to add to userlist
        
        //accountList.add(account);
        //return account;
        
    }
    
    
    
  */  
    
    
    
   
}
