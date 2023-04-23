package Home_Work_OOP_2;

public class Plate {
    private static int food;
    public Plate(int food) {
        Plate.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public static int getFood(){
        return food;
    }

    public void setFood(int food){
        if(food >= 0)
        System.out.println("plate: " + food);
        Plate.food = food;
    }
}
