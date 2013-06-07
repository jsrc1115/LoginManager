/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login_beans;

import java.util.HashMap;

/**
 *
 * @author Sebastian
 */
public class DummyLoginData {
    private static HashMap<String,String> users;
    
    static{
        users = new HashMap<String, String>();
        users.put("jsrc", "qwe");
    }
    
    public static ROb verifyUserData(String username,String password)
    {
        ROb response = new ROb();
        String pass = users.get(username);
        boolean passCorrect = false;
        if(pass != null)
        {
            passCorrect = pass.equals(password);
        }
        
        response.setSuccess(passCorrect);
        System.out.println(passCorrect);
        return response;
    }
    
}
