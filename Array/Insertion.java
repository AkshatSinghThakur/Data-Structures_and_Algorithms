class Insertion {
    public static void main(String[] args) {
        
        int[] array = {12,23,34,45,56,67};   // Creating an Array
        System.out.println(array[4]);
        array[4] = 200;                   // updated the value of an element at a specific index
        System.out.println(array[4]); 

        // Creating an array
        int arr[];
        arr = new int[10];
        System.out.println("Array created Successfully");

        // Adding same element in entire array 
        for( int i=0 ; i <= 9 ; i++) {
            arr[i] = 22;
        }

        System.out.println("Elements added in array successfully");
        System.out.println("Array :- ");
        
        // Printing entire array
        for( int i=0 ; i <= 9 ; i++) {
            System.out.println("Index " + i + " = " + arr[i]);
        }
    }
}