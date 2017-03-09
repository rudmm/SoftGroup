/**
 * Created by michael on 04.03.17.
 */
public class two implements Runnable {
    String name;
    int n;
    public two(String name, int n){
        this.name = name;
        this.n = n;
    }
    public void run(){
        System.out.print(name+" побудував ряд Фибоначчі ");
        int a=0;//перший член
        int b = 1;//другий член
        int i=0;
        int sum_fib = 1;
        System.out.print(i+" ");
        /*
        за допомогою цикла "поки" будуємо ряд Фібоначчі
         */
        while(i++ < n-1){
            System.out.print(sum_fib + " ");
            sum_fib = a + b;
            a = b;
            b = sum_fib;
        }
        System.out.println("за "+System.currentTimeMillis()+" мс");//вимірюємо продуктивність способу
    }
}
