// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class ShiftGrid {
    
    public static int [] arrayshift(int arr[]){
        int last = arr[arr.length-1];
        for (int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0]=last;
        return arr;
    }
    
    public static void printarray(int arr[][],int m, int n){
        for(int i = 0;i<m; i++){
            for(int j =0;j<n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static int [][] gridshift(int arr[][], int m, int n, int k){
        int newarr[] = new int[m*n];
        int index = 0;
        for(int i = 0;i<m; i++){
            for(int j =0;j<n; j++){
                 newarr[index++] = arr[i][j];
            }
        }
        for(int i=0;i<k;i++){
             newarr = arrayshift(newarr);
        }
        
        index =0;
         for(int i = 0;i<m; i++){
            for(int j =0;j<n; j++){
                 arr[i][j]= newarr[index++];
            }
        }
        
        return arr;
        
    }
     
    public static void main(String[] args) {
        
        int m = 3;
        int n = 3;
        int k = 0;
        int arr[][]= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("Original array is:\n");
        printarray(arr,m,n);
        arr = gridshift(arr,m,n,k);
        System.out.println("Shifted array is:\n");
        printarray(arr,m,n);
    }
}