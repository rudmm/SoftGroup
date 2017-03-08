package com.company;

import java.io.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String a = bufferedReader.readLine();
        System.out.println(pal(a));


    }
    public static String reversString(String str){ // метод reversString переобразує введену користувачем строку до дзеркального відображення
        String s1 ="";
        for (int i = str.length()-1;i>=0;i--) {
            s1 += str.charAt(i);
        }
        return s1;
    }
    public static String pal(String a){
        String s = reversString(a);
        String s1 = "паліндром";
        String s2 = "не паліндром"; //метод pal поревіряє чи нова строка і строка введена користувачем є одинаковими
        if(a.equals(s)){
            return s1;
        }
        else{
            return s2;
        }

    }
}