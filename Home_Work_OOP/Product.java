package Home_Work_OOP;

/**
 * Продукт
 */
public class Product {

    protected String name;
    protected String brand;
    protected double price;

   

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if (price <= 0){
            throw new RuntimeException("Цена указана некорректно.");
        }
        this.price = price;
        /*if (price <= 0)
            this.price = 1;
        else
            this.price = price;*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3)
            this.name = "Продукт";
        else
            this.name = name;
    }

   

    public Product(){
        this("Продукт");
    }

    public Product(String name){
        this(name, 1);
    }

    public Product(String name, double price){
        this("Noname", name, price);

    }

    public Product(String brand, String name, double price){
        System.out.println("Constructor");
        if (brand.length() < 3)
            this.brand = "Noname";
        else
            this.brand = brand;
        if (name.length() < 3)
            this.name = "Продукт";
        else
            this.name = name;
        if (price <= 0)
            this.price = 1;
        else
            this.price = price;
    }

    /**
     * Получить информацию по продукту
     * @return Информация по продукту
     */
    String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }

}
