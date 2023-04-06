package home_work_4;
import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(ls, getRandomNumber()); //заполняем случайными числами
        }
        System.out.println(ls);

        System.out.println(dequeue(ls)); // удалили первый элемент
        System.out.println(ls);

        System.out.println(first(ls)); // вывели первый элемент
        System.out.println(ls); 
    }

    public static void enqueue(LinkedList<Integer> ls, int num) {// помещает элемент в конец очереди
        ls.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> ls) { // возвращает первый элемент из очереди и удаляет его
        int num = ls.get(0);
        ls.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ls) { // возвращает первый элемент из очереди, не удаляя
        int num = ls.get(0);
        return num;
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
    

