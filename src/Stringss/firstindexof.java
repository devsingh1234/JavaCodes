package Stringss;

public class firstindexof {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,5};
        System.out.println(firstindex(arr, 0, 5));

    }
    public static int firstindex(int arr[],int si , int data){
        if (arr.length == si){
            return -1;
        }
        if (arr[si] == data){
            return si;

        }else{
            int ans = firstindex(arr,si+1,data);
            return ans;
        }
    }
}
