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
        
        while (opcionInicio != 3) {
            System.out.println("=== INICIO ===");
            System.out.println("1 - Login");
            System.out.println("2 - Crear usuario");
            System.out.println("3 - Salir");
            opcionInicio = leer.nextInt();
            
            System.out.println("------------------");
            
            switch (opcionInicio) {
                case 1:
                    
                    //Login
                    System.out.println("Ingrese el nombre de usuario: ");
                    
                    System.out.println("Ingrese la contraseña: ");
                    
                    
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
                    break;
                    
                case 2:
                    
                    //Crear usuario
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
