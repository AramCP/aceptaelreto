/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author arastr
 */
public class Hangares {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        int i;
    
        int cantidadHangares = input.nextInt();
        int tamañoHangares[] = new int[cantidadHangares];
        
        for(i=0; i<tamañoHangares.length; i++){
            tamañoHangares[i] = input.nextInt();
        }
        
        int cantidadNaves = input.nextInt();
        int tamañoNaves[] = new int[cantidadNaves];
        
        for(i=0; i<tamañoNaves.length; i++){
            tamañoNaves[i] = input.nextInt();
        }
        
        //Que hangar tiene mas espacio?
        int HangarMasGrande = 0;
        int EspacioRestante;
        
        for(int n=0; i<tamañoNaves.length; n++){
            for(i=0; i<tamañoHangares.length;i++) {
                if(tamañoHangares[i] > HangarMasGrande) {
                    HangarMasGrande = tamañoHangares[i];
                }
            }
            
            EspacioRestante = HangarMasGrande - tamañoNaves[i];
            
            System.out.println(EspacioRestante);
        }
        
    }

}
