/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectoii;

/**
 *
 * @author Jibsam
 */

import java.util.Scanner;

public class ProyectoII {
    public static void main(String[] args) {
        int opcionInicio = 0;
        Scanner leer = new Scanner(System.in);
        Battleship battle = new Battleship();
        
        while (opcionInicio != 3) {
            System.out.println("=== INICIO ===");
            System.out.println("1 - Login");
            System.out.println("2 - Crear usuario");
            System.out.println("3 - Salir");
            opcionInicio = leer.nextInt();
            
            System.out.println("------------------");
            
            switch (opcionInicio) {
                case 1:
                    String username, password;
                    boolean login = false;
                    
                    //Login
                    System.out.println("=== LOGIN ===");
                    System.out.println("Ingrese el nombre de usuario: ");
                    username = leer.next();
                    
                    if (battle.search(username) == null) {
                        System.out.println("El nombre de usuario no existe.");
                    } else {
                        System.out.println("Ingrese la contraseña: ");
                        password = leer.next();
                        
                        if (battle.login(username, password) == true) {
                            System.out.println("Se ha iniciado sesión.");
                            login = true;
                        } else {
                            System.out.println("La contraseña es incorrecta.");
                        }
                        
                    }
                    
                    if (login == true) {
                        //Menú principal
                        int opcionMenu = 0;
                        while (opcionMenu != 5) {
                            System.out.println("=== MENÚ ===");
                            System.out.println("1 - Jugar Battleship");
                            System.out.println("2 - Configuración");
                            System.out.println("3 - Reportes");
                            System.out.println("4 - Mi Perfil");
                            System.out.println("5 - Salir");
                            opcionMenu = leer.nextInt();

                            switch (opcionMenu) {
                                case 1:

                                    //Jugar Battleship
                                    System.out.println("------------------");
                                    break;
                                case 2:

                                    //Configuración
                                    System.out.println("------------------");
                                    break;
                                case 3:

                                    //Reportes
                                    System.out.println("------------------");
                                    break;
                                case 4:

                                    //Mi Perfil
                                    System.out.println("------------------");
                                    break;
                                case 5:

                                    //Salir
                                    
                                    login = false;
                                    System.out.println("Se ha cerrado sesión.");
                                    System.out.println("------------------");
                                    break;
                                default:

                                    //Error
                                    System.out.println("*** ERROR ***");
                                    System.out.println("La opción es inválida");
                                    System.out.println("------------------");
                                    break;
                            }   
                        }
                    }
                    break;
                    
                case 2:
                    
                    //Crear usuario
                    System.out.println("=== CREAR USUARIO ===");
                    System.out.println("Ingrese su nuevo nombre de usuario: ");
                    username = leer.next();
                    System.out.println("Ingrese su nueva contraseña: ");
                    password = leer.next();
                    
                    if (battle.addPlayer(username, password) == true) {
                        battle.addPlayer(username, password);
                        System.out.println("Se añadió el usuario.");
                    } else {
                        System.out.println("*** ERROR ***");
                        System.out.println("El nombre de usuario ya existe.");
                    }
                    
                    System.out.println("------------------");
                    break;
                    
                case 3:
                    
                    //Salir
                    System.out.println("------------------");
                    break;
                    
                default:
                    
                    //Error
                    System.out.println("*** ERROR ***");
                    System.out.println("La opción no es válida");
                    System.out.println("------------------");
                    break;
            }
        }
        
    }
}
