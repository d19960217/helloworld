package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author fengstart
 * @createdate 2022-11-27 02:20
 */
public class test {



    public static void main(String[] args) {
        System.out.println("hello world.");

        System.out.println();
        System.out.println("Hellowworld.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("args = " + args);
        int sum ;
        String[] arr =new String[]{"tom","jerry","feng"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //list.for
        ArrayList list = new ArrayList<>();
        list.add(123);
        list.add(567);
        for (Object o : list) {
            
        }
//list.fori
        System.out.println("\n");
        System.out.println("\n");

        for (int i = 0; i < list.size(); i++) {
            
        }
        
      //list.forr
        System.out.println("\n");

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }  

    }



}
