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
public class Stone {
    private final Color color;
    private double weight;
    
    public Stone(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    
    public Color getColor() {
        return color;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void action() {
        System.out.println("Показать камень эксперту!");
    }
    
    @Override
    public String toString() {
        return "Неопределенный камень весом " +
                getWeight() + " кг, цвет " +
                getColor().getName() + ".";
    }
}
