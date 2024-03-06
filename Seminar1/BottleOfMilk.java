package Seminar1;

public class BottleOfMilk extends Product {

    private  double volume; // объем
    private  double fat; // Содержание жирности

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }
    public BottleOfMilk(String brand, String name, double price, double volume, double fat){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка с молоком:\t[Производитель: %s, Наименование: %s, Стоимость: %.2f, Объем: %.2f, Жирность: %.2f]",
                brand, name, price, volume, fat);
    }

}
