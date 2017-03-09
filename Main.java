import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
import java.lang.*;

/**
 * Created by michael on 04.03.17.
 */
public class Main {
    public static void main(String[] args){
        int n;
        System.out.print("Введіть кількість членів ряду Фібоначчі: n = ");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        System.out.println();
        /*
        Создаємо три потоки для виконання трьох способів побудування ряду Фібоначчі
         */
        Thread t1 = new Thread(new one("1 спосіб", n));
        Thread t2 = new Thread(new two("2 спосіб", n));
        Thread t3 = new Thread(new three("3 спосіб", n));
        t1.start();
        try{
            t1.join();//наступний потік на стартує поки перший не завершить свою роботу
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        try{
            t2.join();//наступний потік на стартує поки перший не завершить свою роботу
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t3.start();

    }
}
