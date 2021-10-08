import java.util.Scanner;

public class numericPattern {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int num = scan.nextInt();

            int k=0;
            for(int row=0; row<num; row++)
            {
                k=1;
                for(int col=0; col<(num+row); col++)
                {
                    if(col<num-row-1)
                        System.out.print("-");
                    else
                    {
                        System.out.print(""+k);
                        if(col<(num-1))
                            k++;

                        else
                            k--;
                    }
                }
                System.out.println(" ");
            }
        }

    }
