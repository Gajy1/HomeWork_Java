package Home_Work_OOP_2;

public class Cat {
    private String name;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat() { 
        if(Plate.getFood() >= appetite){
            System.out.printf("%s поел\n", name);  
        }
        else{
            System.out.printf("%s не поел\n", name);
        }
    }

    public int getAppetite(){
        return appetite;
    }

    public boolean Fullnes(){
        if(Plate.getFood() < appetite){
        System.out.printf("%s голодный\n", name);
        return false;
        }
        else{
            System.out.printf("%s сыт\n", name);
            return true;
        }
    }
}
