/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

/**
 *
 * @author Jibsam
 */
public class Battleship {
    private Player usuarios[];
    int tamaño = 1;
    
    
    public Battleship() {
        usuarios = new Player[tamaño];
    }
    
    
    
    public Player search(String usuario) {
        for (Player user:usuarios) {
            if (user != null && user.getUsuario().equals(usuario)) {
                return user;
            }
        }
        return null;
    }
    
    public boolean addPlayer (String username, String password) {
        if (search(username) == null) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] == null) {
                    tamaño = tamaño + 1;
                    usuarios = new Player[tamaño];
                    usuarios[i] = new Player(username, password);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean login (String username, String password) {
        if (search(username) != null) {
            for (Player user:usuarios) {
                if (user != null && user.getUsuario().equals(username)) {
                    if (password.equals(user.getContraseña())) {
                       return true; 
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
