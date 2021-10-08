package Stringss;

import java.util.Scanner;

public class vedant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("enter the number of test cases");
        int a  = scan.nextInt();//testcases
        //1int[] answer = new int[a];//for answers
        for (int i = 0; i <a; i++) {
            //System.out.println("enter the  number");
            int n = scan.nextInt();
            int k = 1;
            for (int j = 1; j <=n; j++) {
                k = k*j;

            }
            System.out.println(k);

        }
            }
}
