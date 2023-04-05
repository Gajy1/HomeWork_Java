//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
package home_work_3;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            list.add(rnd.nextInt(10));
        }
        System.out.println(list.toString());
        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
        for(int i=0;i<list.size();i++){
            if (list.get(i)>max) max = list.get(i);
            if (list.get(i)<min) min = list.get(i);
            sum=sum+list.get(i);
        }
        System.out.printf("Максимальный элемент: %d\n",max);
        System.out.printf("Минимальный элемент: %d\n",min);
        System.out.printf("Среднее арифметическое: %.1f\n",((float)sum/list.size()));
    }
    
}
