package Home_Work_OOP_7;

public class Student implements Observer {

    private  String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(String companyName, String vacansy, int salary) {
        if (this.salary < salary){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s: %s -  %d]\n", name, companyName, vacansy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше! [%s: %s -  %d]\n", name, companyName, vacansy, salary);
        }
    }
}
