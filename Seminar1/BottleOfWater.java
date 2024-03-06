package Seminar1;

public class BottleOfWater extends Product{

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка с водой:\t[Производитель: %s, Наименование: %s, Стоимость: %.2f, Объем: %.2f]",
                brand, name, price, volume);
    }
}
