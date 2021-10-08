import java.util.Scanner;

public class Pattern5 {




    public class pattern5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the number of rows");
            int n = scan.nextInt();
            int nst = n;
            int nsp = 0;
            int row = 1 ;
            while(row<=n){
                // spaces  work
                int spc = 0;
                while(spc<=nsp){
                    System.out.print(" ");
                    spc++;

                }

                //for stars
                int str = 1;
                while (str<=nst){
                    System.out.print("*");
                    str++;
                }
                System.out.println();
                row=row+1;
                nsp = nsp+1;
                nst = nst-1;

            }
        }
    }

}
