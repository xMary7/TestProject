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
public class Jewelry extends Stone {
    private final String name;
    private final static double CARAT = 5E+3;
    private double price;
    
    public Jewelry(String name, double price, Color color, double weight) {
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
    
    @Override
    public double getWeight() {
        return super.getWeight() * CARAT;
    }
    
    @Override
    public void action() {
        System.out.println("Выставить на продажу в ювелирном магазине!");
    }
 
    public double totalCost() {
        return getWeight() * price;
    }
    
    @Override
    public String toString() {
        return "Драгоценый камень " + name +
                " весом " + getWeight() +
                " карат, " + getColor().getName() + " цвет, стоимость " + totalCost() + " $.";
    }
}
