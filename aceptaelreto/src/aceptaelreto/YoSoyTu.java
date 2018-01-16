/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author arastr
 */
public class YoSoyTu {
    
    public static void main(String args[]){
                
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantos casos de prueba?");
        int casos = input.nextInt();

        String nombre1[] = new String[casos];
        String nombre2[] = new String [casos];

        for(int i=0; i<nombre1.length; i++){
            nombre1[i] = input.next();
            nombre2[i] = input.next();
        }
        
        for(int i=0; i<nombre1.length; i++){
            if(nombre1[i].equals("Luke") && nombre2[i].equals("padre")){
                System.out.println("TOP SECRET");
            } else {
                System.out.println(nombre1[i] + ", yo soy tu "+nombre2[i]);
            }
        }
    }
}
