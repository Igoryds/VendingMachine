package Seminar1;
public class Snacks extends Product{

    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Snacks(String brand, String name, double price, int calories){
        super(brand, name, price);
        this.calories = calories;

    }

    @Override
    public String displayInfo() {
        return String.format("Упаковка снэков:\t[Производитель: %s, Наименование: %s, Стоимость: %.2f, Энергетическая ценность: %d кКал]",
                brand, name, price, calories);
    }
}

