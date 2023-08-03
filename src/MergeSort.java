
public class MergeSort {
    public static void main(String[] args){
        int[] array = {21, 11, 4, 54, 7, 65, 52, 33, 74, 97};
        mergeSort(array);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if(length == 1) return;

        int mid = length/2;                         // on devise tableau en 2
        int [] left = new int[mid];
        int [] right = new int[length - mid];       // si tableau est en pair, cote gauche va etre pair et droite en pair


        for (int i = 0; i < mid; i++){
            left[i] = array[i];
        }
        for (int i = mid; i < length; i++){
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static void merge(int[] arr, int[] l, int[] r){
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while(i < left && j < right){
            if(l[i] < r[j]){
                arr[idx] = l[i];
                i++;
            }else {
                arr[idx] = r[j];
                j++;
            }
            idx++;

        }
        for (int ll = i; ll < left; ll++){
            arr[idx++] = l[ll];
        }

        for (int rr = j; rr < right; rr++){
            arr[idx++] = r[rr];
        }
    }
}