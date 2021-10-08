import java.util.Scanner;

public class patern13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = scan.nextInt();
        int nrwo = 2 * n - 1;
        int row = 1;
        int str = 1;
        while (row <= nrwo) {


            int star = 1;
            while (star <= str) {
                System.out.print("*");
                star++;


            }
            System.out.println();

            if (row<= nrwo / 2){
                str++;
            }else
                str = str-1;

            row = row+1;
        }
    }
}