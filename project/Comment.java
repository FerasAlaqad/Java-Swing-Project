/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.util.ArrayList;

public class Comment extends Entry {
    
    String yazar;
    String yorum;

    public Comment(String yazar, String yorum) {
        this.yazar = yazar;
        this.yorum = yorum;
    }
    
    
    public Comment() {
        
    }
    
}
