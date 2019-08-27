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
public class BuildingStones extends Stone {
    private final String name;
    private double price;
    
    public BuildingStones(String name, double price, Color color, double weight) {
        super(color, weight);
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double totalCost() {
        return getWeight() * price;
    }
    
    @Override
    public void action() {
        System.out.println("Отправить в отдел строительных материалов!");
    }
    
    @Override
    public String toString() {
        return "Строительный камень " + name +
                " весом " + getWeight() +
                " кг, цвет " + getColor().getName() + ", стоимость " + totalCost() + " $.";
    }
}
