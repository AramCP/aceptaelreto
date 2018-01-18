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
public class LadoOscuro {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
             
        int baseToConvertTo = 5;
        

        int counter = 0;
        char c;
        String b;
        String array[];
        
        System.out.println("Cuantos casos de prueba?");
        int casos = input.nextInt();
        array = new String[casos];
        for(int f=0; f<casos; f++){
            

            int n = input.nextInt();
            
            String n2 = Long.toString(n, baseToConvertTo);
            int length = n2.length();

            for(int i=0; i<length; i++){

               c = n2.charAt(i);
               b = String.valueOf(c);
               if(b.equals("4")){
                   counter++;
               }
            }
            
            if(counter>=2){
                   array[f] = "SI";
               } else {
                   array[f] = "NO";
            }
            counter = 0;
        }
        for(int a=0; a<casos; a++){
            System.out.println(array[a]);
        }
        
    }
    
}
