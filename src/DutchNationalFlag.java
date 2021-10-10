public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {1,1,0,2,1,0,2};
        int[] ans = DutchProblem(arr);
        printt(ans);
    }

    public static int[] DutchProblem(int arr[]) {
        int mid = 0;
        int low = 0;
        int temp = 0;
        int high = arr.length - 1;
        while (mid<=high) {
            if (arr[mid] == 0) {

                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;

            } else {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
        return arr;
    }
    public static void printt(int[] arr){


        for (int i = 0; i <arr.length ; i++) {
            System.out.println(" the number at " + i + " index is");
            System.out.println(arr[i]);
        }


    }
}
