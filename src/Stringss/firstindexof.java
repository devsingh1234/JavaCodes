package Stringss;

public class firstindexof {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,5};
        System.out.println(firstindex(arr, 0, 5));

    }
    public static int firstindex(int arr[],int start , int data){
        if (arr.length == start){
            return -1;
        }
        if (arr[start] == data){
            return start;

        }else{
            int ans = firstindex(arr,start+1,data);
            return ans;
        }
    }
}
