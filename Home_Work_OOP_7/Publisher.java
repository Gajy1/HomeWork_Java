package Home_Work_OOP_7;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameCompany, String vacansy, int salary);

}
