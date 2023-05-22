package Home_Work_OOP_6.task2;

import java.util.ArrayList;
import java.util.List;

public class Report{

    private List<ReportItem> items;	// Отчетные данные
    // расчет отчетных данных

    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
        items.add(new ReportItem("First", (float)60));
        items.add(new ReportItem("Second", (float)27));
    }

        
    

     public void output(ReportInterfase reportInterfase){
        reportInterfase.output(items);
    
    }

 

}
