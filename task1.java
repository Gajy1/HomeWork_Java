//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//Ввод:5
//Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//n! 1 * 2 * 3 * 4 * 5 = 120

package HomeWork_java.HomeWork_Java;

import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        int summ = 1;
        float factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        for(int i = 2; i < n + 1; ++i){
            summ += i;
            factorial *= i;
        }
        System.out.println(summ);
        System.out.println(factorial);
    }
}