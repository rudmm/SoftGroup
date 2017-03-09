

/**
 * Created by michael on 04.03.17.
 */
public class one implements Runnable {
    String name;
    int n;
    public one(String name, int n){
        this.name = name;
        this.n = n;

    }
    public void run(){
        System.out.print(name+" побудував ряд Фібоначчі ");
        int a = 0;//перший член
        int b = 1;//другий член

        int fib;

        System.out.print(a+" "+b+" ");
        /*
        за допомогою циклу будуємо ряд Фібоначчі
         */
        for(int i = 0;i<n-2;i++){
            fib = a+b;
            a = b;
            b=fib;
            System.out.print(fib+" ");
        }
        System.out.println("за "+System.currentTimeMillis()+" мс");//вимірюємо продуктивність способу
    }
}
