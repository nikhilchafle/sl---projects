    public class ArrayRotation  
    {  
   
    public static void rotateLeft(int array[], int d, int n)   
    {   
    for (int i = 0; i < d; i++)   
   
    rotateArrayByOne(array, n);   
    }   
    public static void rotateArrayByOne(int array[], int n)   
    {   
    int i, temp;   
  
    temp = array[0];   
    for (i = 0; i < n - 1; i++)   
   
    array[i] = array[i + 1];  
    array[i] = temp;   
    }   
    public static void main(String args[])   
    {   
    int array[] = { 11, 12, 13, 14, 15, 16, 17 };   
    int r = 1;  
   
    int n = array.length;  
    System.out.println("Array before rotation: ");   
    for(int i = 0 ; i < n ; i++)  
    {   
    System.out.print(array[i]+ " ");   
    }  
    System.out.println();  
    rotateLeft(array, r, n);   
    System.out.println("\nArray after left rotation: ");   
    for(int i = 0 ; i < n ; i++)  
    {      
    System.out.print(array[i] + " ");  
    }   
    }   
    }  