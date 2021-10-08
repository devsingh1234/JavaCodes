public class RecursionFabno {
    public static void main(String[] args) {
        System.out.println(fabno(5)); }
    public static int fabno(int n) {
        if (n == 1 || n == 0) {
            return n; }
        int fnm = fabno(n - 1);
        int fnm1 = fabno(n - 2);
        int fn = fnm + fnm1;
        return fn; }}
