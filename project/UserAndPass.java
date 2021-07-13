/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.util.ArrayList;

public class UserAndPass {
    

    String user;
    String pass;


    
    ArrayList<String> users = new ArrayList<>();

    public UserAndPass(String user, String pass) {
        this.user = user;
        this.pass = pass;
        users.add(user);
        users.add(pass);
    }

    public UserAndPass() {
    }
    
    

}
