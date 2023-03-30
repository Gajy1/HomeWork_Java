package home_work_2;


import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;

/**
 * Task1
 */
public class Task1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task1.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        int [] arr = {1, 5, 9, 19, 45, 32, 2, 8, 5};
        int t = 0;
        for(int i = 0; i < arr.length - 1; ++i){
            
            for(int j = 0; j < arr.length - 1; ++j){
                if(arr[j] > arr[j + 1]){
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    logger.info("Iteration completed");
                }
            }
            
            
        
        }

        System.out.println(Arrays.toString(arr));
    }
}