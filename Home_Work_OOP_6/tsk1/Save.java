package Home_Work_OOP_6.tsk1;

import java.io.FileWriter;
import java.io.IOException;

public class Save {


    public void saveToJson(String Name) {
        String fileName = Name;
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ Order.getClientName() + "\",\n");
            writer.write("\"product\":\""+Order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+Order.getQnt()+",\n");
            writer.write("\"price\":"+Order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
    
}
