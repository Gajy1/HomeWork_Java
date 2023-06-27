package HomeWork_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
     public static void main(String[] args) {
        int [] ids = {1,2,3,4,5};
    String [] names = {"Kukla", "Boll", "Care", "Pazle", "Constructor"};
    double [] frequencies = {0.2, 0.3, 0.1, 0.2, 0.2};

    PriorityQueue toysQueue = new PriorityQueue((t1, t2) -> Double.compare(((Toy) t2).getFrequency(), ((Toy) t1).getFrequency()));

    for(int i = 0; i < ids.length; i++)
    {
        Toy toy = new Toy(ids[i], names[i], frequencies[i]);
        toysQueue.add(toy);
    }
     
    List<Toy> resultList = new ArrayList();
    for(int i = 0; i < 10; i++)
    {
       Toy currentToy = (Toy) toysQueue.poll();
       resultList.add(currentToy);
    }

    String fileName = "result.txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
    for (Toy toy : resultList) {
            writer.write(String.format("Id: %d, Name: %s, Frame: %.2fn",
            toy.getId(), toy.getName(), toy.getFrequency()));
        }
    }catch (IOException e) {
        System.err.format("IOException: %s%n", e);
    }

        
}
    
}
