/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator = new Random();
        TreeSet ts = new TreeSet();

        
        for (int i = 0; i < 100; i++) {
            ts.add(generator.nextInt(9));
        }
        System.out.println(ts);
    }

}
