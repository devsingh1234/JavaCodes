import java.util.Scanner;

public class OneandZeros {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        for (int row = 1; row <=n; row++) {
            for (int i = 1; i <=row; i++) {
                if (row%2==0) {
                    if (i % 2 == 0) {
                        System.out.print(0);
                    } else {
                        System.out.print(1);
                    }
                }else {
                    if (i % 2 == 0) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }

            }

            System.out.println();
        }

    }
}
