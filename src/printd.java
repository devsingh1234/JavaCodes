public class printd {
    public static void main(String[] args) {
        System.out.println(power(8,2));
        System.out.println("----------------------");

    }

   public static int fact(int  n){
        if (n==1) {
            return 1;
        }
       int fn1= fact(n-1);
       int k= n*fn1;
       return k;
   }

   public static int power(int g , int n){
        if (g==0){
            return 1;
        }
        int powerw = power(g-1,n);
        int k =  n*powerw;

        return k;
   }



}
