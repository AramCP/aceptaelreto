/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FuerzasImperiales {
    static Scanner input = new Scanner(System.in);
    static char mapa[][];
    
    public static void main(String args[]) throws IOException{
    
        int x = 0;
        int y = 0;
        
        System.out.println("Numero de filas: ");
        x = input.nextInt();
        
        System.out.println("Numero de columnas: ");
        y = input.nextInt();
        
        mapa = new char[x][y];
        
        //Introducir simbolos
        for(int f=0; f<x; f++){
            for(int c=0; c<y; c++){
                mapa[f][c] = (char) System.in.read();
            }
        }
        
        System.out.println("");
        
        //Leer el mapa
        for(int f=0; f<x; f++){
            for(int c=0; c<y; c++){
                System.out.print(mapa[f][c]);
            }
            System.out.println("");
        }   
    }   
}
