package Home_Work_OOP_7;

public class Junior implements Observer {

    private  String name;
    private int salary;

    public Junior(String name) {
        this.name = name;
        salary = 30000;
    }

    @Override
    public void receiveOffer(String companyName, String vacansy, int salary) {
        if (this.salary < salary){
            System.out.printf("Junior %s >>> Мне нужна эта работа! [%s: %s - %d]\n", name, companyName, vacansy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Junior %s >>> Я найду работу получше! [%s: %s - %d]\n", name, companyName, vacansy, salary);
        }
    }
    
}
