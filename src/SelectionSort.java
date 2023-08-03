public class SelectionSort {

    public static void main(String[] args){
        int[] array = {14, 11, 4, 54, 7, 65, 52, 33, 74, 97, 11, 1, 100};

        selectionSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

    static void selectionSort(int[] arr){            // mu zapamiatovyemo pershui element masuvy i naznachaemo jak naimenshui

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {   // chum chuklom mu probihaemosja po inshum elementam chukly zrimniaiuchu ego z min
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min != i){                             //  jaksho min ne e i to mu miniaemo mischiamu
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }

    }
}
