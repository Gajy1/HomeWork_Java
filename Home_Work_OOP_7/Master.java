package Home_Work_OOP_7;

public class Master implements Observer {
    private  String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(String companyName, String vacancy, int salary) {
        if (this.salary < salary){
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s: %s - %d]\n", name, companyName, vacancy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Мастер %s >>> Я найду работу получше! [%s: %s -  %d]\n", name, companyName, vacancy, salary);
        }
    }
}
