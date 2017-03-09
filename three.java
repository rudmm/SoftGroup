/**
 * Created by michael on 04.03.17.
 */
public class three implements Runnable{

    String name;
    int n;

    public three(String name, int n){
        this.name = name;
        this.n = n;
    }

    public void run(){

        int a[] = new int[n];
        a[0] = 0;//перший член
        a[1] = 1;//другий член
        /*
        за допомогою масива зберігаємо ряд фібоначчі
         */
        for(int i = 2; i<n; i++){
            a[i] = a[i-1] + a[i -2];
        }
        System.out.print(name+" побудував ряд Фибоначчі ");

        for(int o : a){
            System.out.print(o + " ");
        }

        System.out.println("за "+System.currentTimeMillis()+" мс");//вимірюємо продуктивність способу
    }
}
