import java.util.*;

class Rotate{

    public static void main(String[] args){
                                                                                                            // N - length of the array //
        int x;int d;

        Scanner sx = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        x = sx.nextInt();
        System.out.println();
                                                                                                        // user-inputs the data in array //
        System.out.print("Enter the numbers to fill in array: ");
        int[] arr = new int[x];
        Scanner sa = new Scanner(System.in);
        for(int i=0;i<x;i++){
            arr[i] = sa.nextInt();
        }
        System.out.println();
                                                                                                            // Printing original array //
        System.out.println("Original array: " );
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        System.out.print("Enter a number to by which to rotate the array: ");
        int p;                                                                                                      // P - positions // 
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        System.out.println();
        
        System.out.print("Enter 0 to rotate left or 1 to rotate right: ");
        Scanner sd = new Scanner(System.in);
        d = sd.nextInt();
        System.out.println();
       
        if(p>0 && p<arr.length){
                       
                                                                                        // Rotating/shifting numbers of array towards left //
        if(d==0){
            for(int i=0; i<p; i++){
                int j,first;
    
                first = arr[0];
                for(j=0;j<arr.length-1;j++){
                    arr[j] = arr[j+1];
                }
    
                arr[j]=first;
            }
            System.out.println("\nArray after rotating: ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }

                                                                                         // Rotating/shifting numbers of array towards right //
        if(d==1){
            for(int i=0;i<p;i++){
                int j,last;
            
             last = arr[arr.length-1];
            for(j=arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[j]=last;
        }
           System.out.println();
      
            System.out.println("\nArray after rotating: ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            }
            
    
        }

        
        else{
            System.out.println("Enter a valid number!!");
        }
    }
       
}

