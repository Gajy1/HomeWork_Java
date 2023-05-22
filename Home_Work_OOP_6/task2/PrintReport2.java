package Home_Work_OOP_6.task2;

import java.util.List;

public class PrintReport2 implements ReportInterfase{

    public void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount() - 2);
        }
    }

}
