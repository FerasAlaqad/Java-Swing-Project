/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.util.ArrayList;

public class Entry {

    int likeiNumber = 0;
    int UnlikeiNumber = 0;
    int sahreNumber = 0;
    int commentNumber = 0;
    String Title;
    String subject;
    ArrayList<Comment> commentArray = new ArrayList();

    public Entry(String Title, String subject) {
        this.Title = Title;
        this.subject = subject;
    }

    public Entry() {
    }

    public Entry(String Title, String subject, String likeiNumber, String UnlikeiNumber, String sahreNumber) {
        this.Title = Title;
        this.subject = subject;
        this.likeiNumber = new Integer(likeiNumber);
        this.UnlikeiNumber = new Integer(UnlikeiNumber);
        this.sahreNumber = new Integer(sahreNumber);
    }

    public void AddToCommentArray(Comment a) {
        commentArray.add(a);
    }
    
}
