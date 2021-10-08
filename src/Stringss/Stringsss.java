package Stringss;

import java.util.Scanner;

public class Stringsss {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System .in);
        System.out.println("enter the number");
        String str = scan.next();
        System.out.println(str);
        for (int j = 0; j < str.length(); j++) {


            for (int i = j; i <=str.length(); i++) {

                System.out.println(str.substring(j,i));

            }
            System.out.println("-------------------------");
        }

    }
}
