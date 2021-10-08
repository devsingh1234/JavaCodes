import java.util.Scanner;

public class ArrayOps {
    static  Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scan.nextInt();
        int max = 0;
        int[] arr = new int[size];
        System.out.println("enter the numbers");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scan.nextInt();

        }

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }



        }
        System.out.println(max);

    }

}
