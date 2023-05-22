package Home_Work_OOP_6.tsk1;

public class Program {

    //TODO: (Домашняя работа: 1) Сохранить заказ в XML документ
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        //order.saveToJson();
        Save save = new Save();
        save.saveToJson("newOrder.xml");

    

    }

}
