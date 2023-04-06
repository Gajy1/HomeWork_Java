//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
package home_work_4;

import java.util.Arrays;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(linkedList);
        System.out.println(reverse(linkedList));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> linkedList) {
        LinkedList<Integer> rev_ls = new LinkedList<>();
        for(int i = linkedList.size() -1; i >= 0; i--){
            rev_ls.add(linkedList.get(i));
        }
        return rev_ls;

        
    } 

    
}
