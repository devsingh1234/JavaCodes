import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 1;
        System.out.println("enter the number");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {

                    while (i>3 && i/2==0) {
                        for (int j = 1; j < i; j++) {
                            if (j == 1 || j == i) {
                                k = 1;
                                System.out.print(k + " ");
                            } else {
                                k = 0;
                            }
                            System.out.print(k + " ");
                        }
                        System.out.print(k);
                    }

                System.out.println();




        }


    }
}
