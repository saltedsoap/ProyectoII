/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

/**
 *
 * @author Jibsam
 */

public class Player {
    private String usuario;
    private String contraseña;
    
    
    public Player (String username, String password)  {
        usuario = username;
        contraseña = password;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public String getContraseña() {
        return contraseña;
    }
}
