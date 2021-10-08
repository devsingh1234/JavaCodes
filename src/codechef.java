import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number of test cases");
        int t = scan.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < t; i++) {
            int k = 0 ;
            //input
            for (int j = 0; j < 3; j++) {
                System.out.println("enter the"+i+" number");
                arr[i] = scan.nextInt();
            }
            //sorting
            for (int j = 0; j < 3; j++) {
                int max =  0;
                if (max<arr[i]){
                    max = arr[i];
                }else{
                    System.out.println(arr[i]);
                }
                
            }




        }


    }
}
