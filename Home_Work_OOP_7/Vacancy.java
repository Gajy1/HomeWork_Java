package Home_Work_OOP_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vacancy {
     
  static List<String> vac = new ArrayList<>(); 

  public static List<String> getVac() {
    return vac;
}

static List<Integer> sal = new ArrayList<>(); 

    public static List<Integer> getSal() {
    return sal;
}

    private static  Random random;
    int n = random.nextInt(3);

   /*  public Vacancy(List<String> vac, List<Integer> sal){
        this.vac = vac;
        this.sal = sal;
    }*/

    public static void Vac(){
        vac.add("Разработчик");
        vac.add("Тестировщик");
        vac.add("Охраник");
    }
    



    public static void Sal(Random random){
     int s1 = random.nextInt(30000) + 100000;
     int s2 = random.nextInt(30000) + 70000;
     int s3 = random.nextInt(30000) + 20000; 
        sal.add(s1);
        sal.add(s2);
        sal.add(s3);
    }


   
}
