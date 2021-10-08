import java.util.Scanner;

public class Araayope {
    static Scanner scan =  new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = takeinput();

        //linearSearch(array);

        //selectionSort(array);
        //insertionSort(array);
        printt(array);


    }


    public static int[] takeinput(){
        System.out.println("enter the size");
        int num = scan.nextInt();
        int[] arr = new int[num];


        for (int i = 0; i<arr.length; i++) {
            System.out.println("enter the number at " + i + "index");
            arr[i] = scan.nextInt();

        }
        return arr;
    }
    public static int linearSearch(int[] arr){
        System.out.println("enter the number you want to search");
        int num = scan.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            if(num == arr[i]){
                System.out.println("the number is found  " + arr[i] + " at " + i + " index " );
            }

        }
        return -1;

    }
    public static void printt(int[] arr){


        for (int i = 0; i <arr.length ; i++) {
            System.out.println(" the number at " + i + " index is");
            System.out.println(arr[i]);
        }


        }
        public static int BinarySearch(int[] array , int item){
            int lo = 0 ;
            int high = array.length;
            while (lo<=high) {
                int mid = (lo + high) / 2;
                if (array[mid] < item) {
                    lo = mid+1;
                } else if (array[mid]>item) {
                    high = mid-1;

                }else {
                    return mid;
                }
            }
            return -1;
        }
        public static void Bublesort(int[] array){


            for (int couter = 0; couter < array.length-1;couter++) {

                for (int j = 0; j < array.length-1-couter; j++) {
                    if (array[j]>array[j+1]){
                       int swap = array[j];
                        array[j] = array[j+1];
                        array[j+1] = swap;

                    }
                }

                
            }

        }
        public static void selectionSort(int[] array){
            for (int counter = 0; counter < array.length-1; counter++) {
                for (int j = counter; j <array.length-1-counter; j++) {
                    int min = counter ;
                    if ( array[min]>array[j]){
                        min=j;
                    }
                    int temp = array[min];
                    array[min] = array[counter];
                    array[counter] = temp;
                }

            }
        }
        public static void insertionSort(int[] array){
            for (int counter = 1; counter <=array.length-1; counter++) {
                int val = array[counter];
                int j = counter-1;
                while (j>=0 && array[j]>val){
                    array[j+1] = array[j];
                    j--;

                }
                array[j+1] = val;
            }
        }



}
