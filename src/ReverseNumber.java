import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int num =  scan.nextInt();
        int ori =  num;
        int rev  = 0 ;

        if (0<=num && num<=1000000000) {
            for (int i = 0; i < num; i++) {
                int remin = num % 10;

                rev = rev * 10 + remin;


                num = num / 10;




            }
        }
        System.out.println(rev);

    }
}
