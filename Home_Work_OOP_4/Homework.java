package Home_Work_OOP_4;

import java.util.ArrayList;


/**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
 */
public class Homework {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box box1 = new Box(apple.getName(), 10, apple.getWeight(), "box1");
        Box box2 = new Box(orange.getName(), 13, orange.getWeight(), "box2");
        
        box1.addFruits();
        box1.info();
        box2.addFruits();
        box2.info();
        
    }
}

abstract class Fruit{

    private final float weight;
    private String name;
    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Fruit(float weight, String name) {
        this.weight = weight;
        this.name = name;
    }
}

class Apple extends Fruit{

    public Apple() {
        super(1.0f, "apple");
    }
}

class Orange extends Fruit{

    public Orange() {
        super(1.5f, "orange");
    }
}

class Box extends Fruit{
    
    public float caunt = 0;
    private String boxname;
    private int boxSize;
    private ArrayList<Object> fruits = new ArrayList<>(boxSize);

public  Box(String name, int boxSize, float waight, String boxname){
    super(waight, name);
    this.boxSize = boxSize;
    this.boxname = boxname;
}

public  void addFruits(){
    for(int i = 0; i < boxSize; i++){
        fruits.add(getName());
        caunt = caunt + getWeight();
      }
}
   // public ArrayList<Object> getFruits(){
       // return fruits;
    //}
   public void info(){
    System.out.printf("\nВ каробке" +" "+boxname+" " + "лежат" + " "+ fruits.size() + " " + fruits.get(0));
    System.out.printf("\nВес %s : %.2f", boxname, caunt);
   }

}

