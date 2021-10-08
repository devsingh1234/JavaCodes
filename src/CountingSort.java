import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of elements ");
        int size = scan.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i <size; i++) {
            arr[i] = scan.nextInt();
        }
            int max = arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }

        int[] bigarr = new int[max+1];

        for (int i = 0; i < size; i++) {
            int counter = 0 ;
            int index = arr[i];

            for (int j = 0; j <size; j++) {
                if(index==arr[j]){
                    counter++;
                }

            }
            bigarr[index] = counter;

        }
        System.out.println(Arrays.toString(bigarr));

    }
}
