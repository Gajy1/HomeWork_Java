package Home_Work_OOP_6.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrintReport3 implements ReportInterfase {

    public void output(List<ReportItem> items) {
        String fileName = "doc.xml";
        for (ReportItem item : items) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("printer" +" "+ item.getDescription() + " " +item.getAmount());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    }

   

   
}
