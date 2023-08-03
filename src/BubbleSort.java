public class BubbleSort {
    public static void main(String[] args){
        int[] array = {21, 11, 4, 54, 7, 65, 52, 33, 74, 97};
        //bubbleSort(array);
        bubbleSortTwin(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void bubbleSort(int [] arr){

        boolean hasSwap = false;
        int length = arr.length-1;
        while (!hasSwap){
            hasSwap = true;
            for (int i = 0; i < length; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    hasSwap = false;
                }
            }
        }
    }



    static void bubbleSortTwin(int[] arr){
        int length = arr.length;

        while(length != 0){
            int max_idx = 0;
            for (int i = 1; i < length ; i++) {

                if(arr[i -1] > arr[i]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;

                    max_idx = i;
                }
            }
            length = max_idx;
        }
    }
}
