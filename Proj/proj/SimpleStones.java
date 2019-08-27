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
public class SimpleStones extends Stone {
    public SimpleStones(Color color, double weight) {
        super(color, weight);        
    }
    
    @Override
    public void action() {
        System.out.println("Выбросить!");
    }
    
    @Override
    public String toString() {
        return "Простой камень весом " +
                getWeight() + " кг, цвет " +
                getColor().getName() + ".";
    }
}
