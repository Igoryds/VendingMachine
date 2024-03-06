package Seminar1;

public class ChocolateBar extends Product{

    private double weight;
    private int calories;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public ChocolateBar(String brand, String name, double price, double weight, int calories){
        super(brand, name, price);
        this.weight = weight;
        this.calories = calories;

    }

    @Override
    public String displayInfo() {
        return String.format("Плитка шоколада:\t[Производитель: %s, Наименование: %s, Стоимость: %.2f, Масса нетто: %.2f г, Энергетическая ценность: %d кКал]",
                brand, name, price, weight, calories);
    }
}
