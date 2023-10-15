/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author mac
 */
public class passwordHashing {
    
  public static ArrayList<UserPasswordHistory> usernameList = new ArrayList<>();
  private static Map<String, String> passwordHistory = new HashMap<>();
  
  
  static void registerUser(String username, String plaintextPassword) {
    int hashedPassword = hashPassword(plaintextPassword);
    UserPasswordHistory newUser = new UserPasswordHistory(username, hashedPassword);
    usernameList.add(newUser);
    passwordHistory.put(username,plaintextPassword);
  }

private static int hashPassword(String plaintextPassword) {
    int hash = 0;
    for (char c : plaintextPassword.toCharArray()) {
      hash += c;
    }
    return hash;
  }

public static boolean loginUser(String username, String enteredPassword) {
    for (UserPasswordHistory user : usernameList) {
      if (user.username.equals(username)) {
        int enteredHash = hashPassword(enteredPassword);
        if (enteredHash == user.hashedPassword) {
          // Check password history to prevent reuse
          if (enteredHash == hashPassword(passwordHistory.get(username)) && passwordHistory.containsKey(username)) {
            System.out.println("Cannot reuse a previous password.");
            return false;
          }
          // Update password history
          passwordHistory.put(username,String.valueOf(enteredHash));
          return true;
        }
      }
    }
    return false;
  }

public static boolean logincheck(String username,String passwordstring)
{   
    int hashofstringpassword = hashPassword(passwordstring);
    for(UserPasswordHistory user: usernameList)
    {
        if(user.username.equals(username))
        {
            if (hashofstringpassword == hashPassword(passwordHistory.get(username)) && passwordHistory.containsKey(username))
                    {
                        return false;
                    }
            else
            {
               
                passwordHistory.put(username,passwordstring);
                return true;
               
            }
        }
        
        
    }
    
    return false;
}

public static class UserPasswordHistory {
    public String username;
    public int hashedPassword;
    UserPasswordHistory(String username, int hashedPassword) {
      this.username = username;
      this.hashedPassword = hashedPassword;
    }

    
}

}

