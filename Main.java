import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by michael on 04.03.17.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame();
        int k;
        int[] mas;
        int l;
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введіть К");
        String s = bufferedReader.readLine();
        k = Integer.parseInt(s);
        System.out.println("K = "+k);
        System.out.println("Введіть розмір масиву");
        String size = bufferedReader.readLine();
        l = Integer.parseInt(size);
        mas = new int[l];
        System.out.println("Заповніть масив числами");
        for(int i=0;i<l;i++){
            try {
                String el = bufferedReader.readLine();
                mas[i] = Integer.parseInt(el);
            }catch (Exception e){
                JOptionPane.showMessageDialog(frame, "Не правильний ввод", "Помилка", JOptionPane.ERROR_MESSAGE);
            }
        }
        for(int t=0;t<l;t++) {
            System.out.print(mas[t]+" ");
        }
        System.out.println();
        complementary(mas, k, l);

    }
    public static String complementary(int[] a, int b, int z){
        int i =0, j =0;
        String stroka = null;
        for( i=0;i<z-1;i++){
            for(j=i+1;j<z;j++){
                if(b==(a[i]+a[j])){
                    stroka = "K = a["+i+"]+a["+j+"]";
                    System.out.println(stroka);
                }
            }
        }
        return stroka;
    }
}
