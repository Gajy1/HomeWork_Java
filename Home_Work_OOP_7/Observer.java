package Home_Work_OOP_7;

/**
 * Интерфейс наблюдателя (соискателя, человек в поисках работы)
 */
public interface Observer {

    void receiveOffer(String companyName, String vacncy, int salary);

}
