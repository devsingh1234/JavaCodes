import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int num = scan.nextInt();
        int counof = scan.nextInt();
        int rem  = 0;
        int count = 0;

        for (int i = 0; i < num; i++) {
            rem =  num % 10;
            if (rem == counof){
                count++;

            }
            num = num/10;

        }
        System.out.println(count);
    }
}
