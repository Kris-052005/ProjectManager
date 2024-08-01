/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comentarios;

import users.User;

/**
 *
 * @author chris
 */
public class Comentario {
    private int id;
    private User user;
    private String comment;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comentario(int id, User user, String comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }

    public Comentario() {
        this(0, new User(),"");
    }
    
}
