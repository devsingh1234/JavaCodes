import java.util.Scanner;

public class founctions {
    public static void main(String[] args) {
         Scanner scan  =  new Scanner(System.in);


        additionPrams(scan.nextInt(), scan.nextInt());

    }


    public static int additionPrams(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
}