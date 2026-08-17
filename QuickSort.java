// Quicksort working 
//it fisrt choose the last element as pivoet element and then placed it a its right position.
// each time it returns the index of the pivoet and then new array are form according to that pivoet index.
//same process is repeted till the start<end.
//if the element is smaller than the pivoet then it swaps it with its next postion.and at last will swap the 
//pivoet with the second last element.

public class QuickSort {
    public static int partition(int arr[], int low, int high){
        int pivoet = arr[high];
        int i = low - 1;
        for(int j = low; j<high; j++){
            if(arr[j]< pivoet){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivoet;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[], int low, int high){
        if(low < high){

            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx -1);
            quickSort(arr, pidx + 1, high);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,7,3,8,2,1};
        int size = arr.length;
        System.out.println("Original array :");
        for(int i :arr){
            System.out.print(i + "\t");
            i++;
        }
        System.out.println("\nSorted Array : ");
        quickSort(arr, 0, size-1);
        for(int i :arr){
            System.out.print(i + "\t");
            i++;
        }
    }
}

