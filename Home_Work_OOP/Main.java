package Home_Work_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        Product product2 = new Product("Бутылка с молоком", 200);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Ок", "11", -100);
        System.out.println(product3.displayInfo());

        //product3.setPrice(-50.5);
       //product3.name = "____";
       // product3.price = -50.5;

        System.out.println(product3.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода", 100, 2);
        System.out.println(bottleOfWater1.displayInfo());

        BottleOfWater bottleOfWater2 = new BottleOfWater("Вода1", 100, 2);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Вода2", 110, 1);
        BottleOfWater bottleOfWater4 = new BottleOfWater("Вода3", 130, 3);
        BottleOfWater bottleOfWater5 = new BottleOfWater("Вода4", 100, 1);

        Product bottleOfMilk1 = new BottleOfMilk("Молоко1", 100, 2, 10);
        Product bottleOfMilk2 = new BottleOfMilk("Молоко2", 50, 1, 3);
        Product bottleOfMilk3 = new BottleOfMilk("Молоко3", 70, 1, 5);
        Product bottleOfMilk4 = new BottleOfMilk("Молоко4", 150, 3, 2);

        Product chocolate1 = new Chocolate("Шоколад1", 120, 90, "Молочный");
        Product chocolate2 = new Chocolate("Шоколад2", 111, 82, "тёмный");
        Product chocolate3 = new Chocolate("Шоколад3", 160, 100, "Молочный");
        Product chocolate4 = new Chocolate("Шоколад4", 250, 120, "тёмный");


        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);

        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        products.add(chocolate4);


        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(products);

        BottleOfWater bottleOfWaterRes =  machine.getBottleOfWater("Вода3", 3);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        BottleOfMilk bottleOfMilkRes =  machine.getBottleOfMilk("Молоко4", 3, 2);
        if (bottleOfMilkRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfMilkRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }

        Chocolate chocolateRes =  machine.getChocolate("Шоколад2", 82, "тёмный");
        if (chocolateRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет в автомате.");
        }

    }


}