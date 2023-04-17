package Home_Work_OOP;

public class Chocolate extends Product {
    private int gram;
    private String milkanddark;

    public int getGram(){
        return gram;
    }

    public String getMilkanddark(){
        return milkanddark;
    }
    
    public Chocolate(String name, double price, int gram, String milkanddark){
        super(name, price);
        this.gram = gram;
        this.milkanddark = milkanddark;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - грамм: %d - шокалад: %s", brand, name, price, gram, milkanddark);

    }
    
}
