/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Comentarios.Comentario;
import java.util.ArrayList;
import users.User;

/**
 *
 * @author krist
 */
public class Task {
    private int id;
    private String description;
    private boolean complete;
    private User user;
    private ArrayList<Comentario> comentarios;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean getComplete() {
        return complete;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    
    public void add (Comentario Comentarios){
        this.comentarios.add(Comentarios);
    }

    public Task(int id, String description, User user) {
        this.id = id;
        this.description = description;
        this.complete = false;
        this.user = user;
        this.comentarios = new ArrayList<>();
    }
    
    
    
    
    
}
