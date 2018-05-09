/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kllab9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class KLlab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in); 
        Random generator = new Random();
        int a;
        int[] tab = new int[100];
        for (int i = 0; i < 100; i++) {
            tab[i] = generator.nextInt(9);
        }
     do{
    System.out.println("1.Wypisz 2.Sortuj 3.Wyjdz");
    a=odczyt.nextInt();
    if(a==1){
     for (int i = 0; i < 100; i++) {
            System.out.println(tab[i]);
        }   
    }else if(a==2){
    Arrays.sort(tab);
    }
     }while(a!=3);
    
    
    
    
    }

}
