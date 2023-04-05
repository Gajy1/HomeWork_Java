//Пусть дан произвольный список целых чисел, удалить из него четные числа

package home_work_3;

import java.util.ArrayList;
import java.util.Random;
public class task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(100);
            list.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s", list);
    }
    
}
