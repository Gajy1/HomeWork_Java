package Home_Work_OOP_6.tsk1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    protected static String clientName;
    protected static String product;
    protected static int qnt;
    protected static int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public static String getClientName() {
        return clientName;
    }

    public static String getProduct() {
        return product;
    }

    public static int getQnt() {
        return qnt;
    }

    public static double getPrice() {
        return price;
    }
 
    /* 
    public void saveToJson() {
        String fileName = "order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ clientName + "\",\n");
            writer.write("\"product\":\""+product+"\",\n");
            writer.write("\"qnt\":"+qnt+",\n");
            writer.write("\"price\":"+price+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    } */

    public void inputFromConsole(){
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
