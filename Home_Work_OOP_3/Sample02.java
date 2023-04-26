package Home_Work_OOP_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sample02 {

    private static Random random = new Random();

    /**
     * TODO: 2. generateEmployee должен создавать различных сотрудников (Worker, Freelancer)
     * @return
     */
    public static Object  generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(1000) + 800;
        int index = random.nextInt(20) + 30;
        int hours = random.nextInt(150) + 1;
        int n = random.nextInt(2);

        Worker worker = new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * index, 0);
        Freelancer freelancer = new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], 23 * index * hours, hours);

        if(n == 1){
            return freelancer;
        }
        else
             return worker;

        //return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * index);
    }

    

    public static void main(String[] args) {

        Worker worker = new Worker("Анатолий", "Шестаков", 80000, 0);
        System.out.println(worker);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
            employees[i] = (Employee) generateEmployee();

        for (Employee employee : employees){
            System.out.println(employee);
        }

        //Arrays.sort(employees, new NameComparator());
        Arrays.sort(employees);

        System.out.printf("\n*** Отсортированный массив сотрудников ***\n\n");

        for (Employee employee : employees){
            System.out.println(employee);
        }

    }

}

class SalaryComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {

        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        return Double.compare( o2.calculateSalary(), o1.calculateSalary());
    }
}

class NameComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        int res = o1.name.compareTo(o2.name);
        if (res == 0){
            res = Double.compare( o2.hours, o1.hours);
        }
        return res;
    }
}

abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected String surName;
    protected double salary;
    protected int hours;

    public Employee(String name, String surName, double salary, int hours) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.hours = hours;
    }

    public abstract  double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Среднемесячная заработная плата: %.2f", name, surName, salary);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare( o.hours, hours);
    }
}

class Worker extends Employee{

    public Worker(String name, String surName, double salary, int hours) {
        super(name, surName, salary, hours);
    }

    public String getName(){
        return name;
    }

    public String getSurName(){
        return surName;
    }

    public double getSalary(){
        return salary;
    }

    
    @Override
    public double calculateSalary() {
        return salary ;
        //TODO: Для фрилансера - return 20 * 5 * salary
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)", name, surName, salary);
    }


}

/**
 * TODO: 1. Доработать самостоятельно в рамках домашней работы
 */

 
class Freelancer extends Employee{

    public Freelancer(String name, String surName, double salary, int hours) {
        super(name, surName, salary, hours);
    
    }

    public String getName(){
        return name;
    }

    public String getSurName(){
        return surName;
    }

    public double getSalary(){
        return salary;
    }

    public int getHours(){
        return hours;
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (Почасовая оплата): %.2f (руб.); Отработанные часы: %d ", name, surName, salary, hours);
    }
    
    
}