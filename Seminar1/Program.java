package Seminar1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        BottleOfWater bottleOfWater1 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);

        Product bottleOfWater2 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);

        Product bottleOfMilk2 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);

        Product chocolateBar1 = new ChocolateBar("Brand #5", "Name #5", 100, 90, 450);

        Product chocolateBar2 = new ChocolateBar("Brand #6", "Name #6", 200, 100, 550);

        Product snacks1 = new Snacks("Brand #5", "Name #7", 150, 600);

        Product snacks2 = new Snacks("Brand #5", "Name #8", 75, 300);

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfWater1);
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(chocolateBar1);
        list.add(snacks2);
        list.add(snacks1);
        list.add(chocolateBar2);


        for (Product product : list) {
            System.out.println(product.displayInfo());
        }
        System.out.println();

        VendingMachine vendingMachine = new VendingMachine(list);
        
        ChocolateBar chocolateBarRes =  vendingMachine.getChocolateBar("Name #5", 100);
        if (chocolateBarRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateBarRes.displayInfo());
        }
        else {
            System.out.println("Такой плитки шоколада нет.");
        }



    }

}
