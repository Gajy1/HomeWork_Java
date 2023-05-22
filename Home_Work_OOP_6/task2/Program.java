package Home_Work_OOP_6.task2;

import java.util.List;

public class Program {

    //TODO: (2 задание ) Доработать самостоятельно
    

    public static void main(String[] args) {
        PrintReport printReport = new PrintReport();
        PrintReport2 printReport2 = new PrintReport2();
        PrintReport3 printReport3 = new PrintReport3();
        Report report = new Report();
        report.calculate();
        report.output(printReport3);
    
    }

}
