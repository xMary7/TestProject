/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

/**
 *
 * @author User
 */
public class Proj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jewelry diamond = new Jewelry("бриллиант", 800.4, Color.TRANSPARENT, 0.001);        
        BuildingStones gr = new BuildingStones("гранит", 0.4, Color.GREY, 250);        
        SimpleStones someStone = new SimpleStones(Color.GREY, 10);        
        Stone undefStone = new Stone(Color.GREEN, 5); 
        
        Stone[] arr = {diamond, gr, someStone, undefStone};
        printInfo(arr);
                
    }


    public static void printInfo(Stone[] stone) {
        for(Stone st: stone) {
            System.out.println(st);
            st.action();
            System.out.println();
        }
    }
    
}
