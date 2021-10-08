public class lastindexof {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,4};
        System.out.println(lastindex(arr, 0, 4));

    }
    public static int lastindex(int arr[], int si, int data) {
        if (arr.length == si) {
            return -1;
        }
        int index = lastindex(arr, si + 1, data);
        if (index == -1) {
            if (arr[si] == data) {
                return si;
            } else {
                return -1;
            }
        }else {
            return index;
        }
    }
}
