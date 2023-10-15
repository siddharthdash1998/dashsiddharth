/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.Set;
import javax.swing.JOptionPane;
import Business.personDirectory;

/**
 *
 * @author mac
 */
public class userDirectory {
    
    //arraylist initialization for userlist
    public ArrayList<User> userList;
    
    //getter and setter for userlist
    

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public userDirectory(){
        
        this.userList = new ArrayList<User>();
        
        
    }
    
    //you might need to pass variables of Person here, come back here later
    
    public void addUserList(Person person){
        
     //   User user = new User();
        User user = new User(person);
        userList.add(user);
        
        
        
        
    }
    
     public User searchUser(String User_Username,String User_Password)
    {
        for(User user : userList){
            if(user.getUser_Username().equals(User_Username) && user.getUser_Password().equals(User_Password)){
                
                //JOptionPane.showMessageDialog(null,"Logging into admin profile","Information",JOptionPane.INFORMATION_MESSAGE);
                return user;
            
            
        }
                 
      
    }
        return null;
    }
     
     //using this to test whether user list is getting updated or not 
     
     public User searchUserUpdated(User test){
         for(User user: userList){
             if(test.getUser_NUID().equals(user.getUser_NUID())){
                 return user;
             }
         }
         return null;
     }
     
     

     
     
         public User searchUserLoginCredentials(String User_Username,String User_Password)
    {
        for(User user : userList){
            if(user.getUser_Username().equals(User_Username) && user.getUser_Password().equals(User_Password) && user.getEnabled_check()==true){
                
                //JOptionPane.showMessageDialog(null,"Logging into admin profile","Information",JOptionPane.INFORMATION_MESSAGE);
                return user;
            
            
        }
                 
      
    }
        return null;
    } 

      public Boolean searchEnabled(Person person)
    {
        for(User user: userList){
            if(person.getNUID().equals(user.getUser_NUID()))
            {
                return user.getEnabled_check();
            }
        }
        
        return null;
    }
      
     public void updateEnabled(Person person, Boolean updatedEnablevalue )
     {
         for(User user:userList){
             if(person.getNUID().equals(user.getUser_NUID()))
             {
                 user.setEnabled_check(updatedEnablevalue);
                 
             }
         }
     }
     
        
}


        


