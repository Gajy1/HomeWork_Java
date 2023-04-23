package Home_Work_OOP_2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 15);
        Cat cat2 = new Cat("Rijic", 5);
        Cat cat3 = new Cat("Gosha", 3);
        Plate plate = new Plate(20);
        plate.info();
        cat.eat();
        cat.Fullnes();
        plate.setFood(Plate.getFood() - cat.getAppetite());
        cat2.eat();
        cat2.Fullnes();
        plate.setFood(Plate.getFood() - cat2.getAppetite());
        cat3.eat();
        cat3.Fullnes();
        plate.setFood(Plate.getFood() - cat2.getAppetite());
    }
}
