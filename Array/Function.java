public class Function{

    public static void printHello(int num){
        System.out.println("Hello world! this is AKshat Singh Thakur");
        System.out.println("Number which came as a parameter is : " + num);
    }
    public static void main(String[] args) {
        System.out.println("This is a program which calls a function and then execute the code written inside that function");
        int number = 20;
        printHello(number);

        int array[];
        array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        
        for ( int i = 0 ; i < array.length ; i++ ) {
            System.out.println("Value at Index " + i + " = " + array[i]);
        }

        try {
            System.out.println(array[5]);
        } catch (Exception exception) {
            System.out.println("Sorry this error occured between the code :- " + exception);
        }
        System.out.println("All the elements if the array has been printed below");
    }
}
