public class MergeSort{

    public static void merge(int arr[], int left, int mid, int right){
        if(left>= right){
            return;
        }
        int n1 = mid -left+1;
        int n2 = right - mid;
        int leftarr[] = new int[n1];
        int rightarr[] = new int[n2];

        for( int i = 0; i<n1; i++){
            leftarr[i] = arr[left +i];
        }

        for( int j = 0; j<n2; j++){
            rightarr[j] = arr[mid +1 +j];
        }

        int i= 0, j = 0;
        int k = left;
        while( i< n1 && j<n2){
            if(leftarr[i] < rightarr[j]){
                arr[k] = leftarr[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightarr[j];
                j++;
                k++;
            }
        }   
        
        while (i<n1) {
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        
        while (j<n2) {
            arr[k] = rightarr[j];
            j++;
            k++;
        }
    }



    public static void mergeSort(int arr[], int left, int right){
        if(left < right){
            int mid = left + (right -left)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);

        }
        else{
            return;
        }
    }

    public static void main(String args[]){
        int arr[] = {9,2,7,5,2,1};
        System.out.println("Original Array : ");
        for(int i: arr){
            System.out.print(i + "\t");
        }
        System.out.println();
        
        mergeSort(arr, 0, (arr.length -1));

        System.out.println("Sorted Array : ");
        
        for(int i: arr){
            System.out.print(i+ "\t");
        }
    }
}