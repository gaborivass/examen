/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        
        System.out.println("por favor ingresar cantidad de filas: ");
        int x = datos.nextInt(); //x= filas
        System.out.println("por favor ingrese cantidad de columnas: ");
        int y = datos.nextInt(); //y= columnas
        
        int Funcion [][]= new int [x] [y];
        
        System.out.println("______________________________________________");
        System.out.println("ingrese valores de la matriz : ");
        
        for (int i = 0; i < x ; i++) 
            for (int j = 0; j < y; j++) 
                
                System.out.print(" matriz : ["+i+"]["+j+"] =");
       
        int funcion = (5*x)-(2*y)*3;
        System.out.print("resultado :["+funcion+"]");
      
    }
    
}
