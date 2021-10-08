import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a  = 3;
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();

        }
        System.out.println("the number before swapping is   :" + array[0] +" "+ array[1]);
            swap(array[0],array[1]);

        System.out.println("the number after swapping is    :" + array[0] + " " + array[1]);

    }

    public static void swap(int a , int b){
        int temp =  a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        return ;

    }
}
