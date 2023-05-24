package Home_Work_OOP_7;

import java.util.Random;

public class Company {

    private Random random;
    private String nameCompany;


    private Publisher jobAgency;

    public Company(String nameCompany, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    /**
     * TODO: Доработать метод, компания должна генерировать объект "Вакансия" и передавать
     *  объект в агенство.
     * Поиск сотрудника
     */
    public void needEmployee(){
   
        Vacancy.Vac();
        Vacancy.Sal(random);
        int x = random.nextInt(3);
        int salary = Vacancy.getSal().get(x);
        String vacancy = Vacancy.getVac().get(x);
        jobAgency.sendOffer(nameCompany, vacancy, salary);
    }

}
